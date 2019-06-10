package com.lrw.interceptor;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.core.MethodParameter;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartRequest;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.HandlerInterceptor;

public class UploadInterceptor implements HandlerInterceptor {
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object obj)
		throws Exception {
	  System.out.println("###执行前拦截");
		HandlerMethod hanm=(HandlerMethod) obj;
		//System.out.println("执行的Action对象"+hanm.getBean()+",类型："+hanm.getBeanType()+"方法名称"+hanm.getMethod());
		MethodParameter mp[]=hanm.getMethodParameters();
		for (int i = 0; i < mp.length; i++) {
			//System.out.println(mp[i]);

		}
		Map<String,String> errors=new HashMap<String, String>();
		
		String filedName=hanm.getMethod().getName()+"Rule";//取得验证规则
		//System.out.println(filedName);
		try{
			Field field=hanm.getBean().getClass().getDeclaredField(filedName);		   
			field.setAccessible(true);//取消掉规则的封装
			String rules=(String) field.get(hanm.getBean());
			//System.out.println(rules);//输出封装的规则
			String result[]=rules.split("\\|");//拆分验证规则
			for (int i = 0; i < result.length; i++) {
				String temp[]=result[i].split(":");
				String paramValue=request.getParameter(temp[0]);
				//System.out.println("参数名称: "+temp[0]+",参数内容: "
				//            +paramValue+",验证规则: "+temp[1]);
				if(paramValue==null){//有错误
					errors.put(temp[0], "数据内容不允许为空");					
				}else{
					if("int".equalsIgnoreCase(temp[1])){
						if(!paramValue.matches("\\d+")){
							errors.put(temp[0], "输入的数据必须是整数");							
						}
					}
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		boolean flag=true;
		if(errors.size()>0){//有错误信息			
			flag=false;
		}else{//表示现在的基础验证完成，下面判断是否有上传文件
			MultipartResolver mf= new CommonsMultipartResolver();
			if(mf.isMultipart(request)){//现在有文件上传
				MultipartRequest mreq=(MultipartRequest) request;
				Map<String,MultipartFile> map=mreq.getFileMap();
				if(map.size()>0){//有上传文件
					Field field=hanm.getBean().getClass().getDeclaredField("mimeRule");		   
					field.setAccessible(true);//取消掉规则的封装
					String mimeRule=(String) field.get(hanm.getBean());
					System.out.println(mimeRule);
					String resultMime [] =mimeRule.split(",");
					Iterator<Map.Entry<String,MultipartFile>> iter=map.entrySet().iterator();
					while(iter.hasNext()){
						Map.Entry<String,MultipartFile> me=iter.next();
						
						String paramName = me.getKey();//取得上传文件的名称
						
						MultipartFile file=me.getValue();//取得上传文件的内容
						
						System.out.println("【文件名称】： "+paramName+",【文件内容】： "+file);
						for (int i = 0; i < resultMime.length; i++) {
							if(!this.isExist(resultMime, file.getContentType())){
								errors.put(paramName, "上传了非法文件");
								flag=false;
								break;								
							}
						}
					}
				}
		    }			
		}
		if(flag==false){
			System.out.println(errors);
			request.getRequestDispatcher("/errors.jsp").forward(request, response);
		    return  false;
		}
		return true;
	}
	public boolean isExist(String data[],String str){		
		for (int i = 0; i < data.length; i++) {
			if(str.equals(data[i])){
				return true;
			}
		}
		return false;
	}
}


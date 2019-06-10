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
	  System.out.println("###ִ��ǰ����");
		HandlerMethod hanm=(HandlerMethod) obj;
		//System.out.println("ִ�е�Action����"+hanm.getBean()+",���ͣ�"+hanm.getBeanType()+"��������"+hanm.getMethod());
		MethodParameter mp[]=hanm.getMethodParameters();
		for (int i = 0; i < mp.length; i++) {
			//System.out.println(mp[i]);

		}
		Map<String,String> errors=new HashMap<String, String>();
		
		String filedName=hanm.getMethod().getName()+"Rule";//ȡ����֤����
		//System.out.println(filedName);
		try{
			Field field=hanm.getBean().getClass().getDeclaredField(filedName);		   
			field.setAccessible(true);//ȡ��������ķ�װ
			String rules=(String) field.get(hanm.getBean());
			//System.out.println(rules);//�����װ�Ĺ���
			String result[]=rules.split("\\|");//�����֤����
			for (int i = 0; i < result.length; i++) {
				String temp[]=result[i].split(":");
				String paramValue=request.getParameter(temp[0]);
				//System.out.println("��������: "+temp[0]+",��������: "
				//            +paramValue+",��֤����: "+temp[1]);
				if(paramValue==null){//�д���
					errors.put(temp[0], "�������ݲ�����Ϊ��");					
				}else{
					if("int".equalsIgnoreCase(temp[1])){
						if(!paramValue.matches("\\d+")){
							errors.put(temp[0], "��������ݱ���������");							
						}
					}
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		boolean flag=true;
		if(errors.size()>0){//�д�����Ϣ			
			flag=false;
		}else{//��ʾ���ڵĻ�����֤��ɣ������ж��Ƿ����ϴ��ļ�
			MultipartResolver mf= new CommonsMultipartResolver();
			if(mf.isMultipart(request)){//�������ļ��ϴ�
				MultipartRequest mreq=(MultipartRequest) request;
				Map<String,MultipartFile> map=mreq.getFileMap();
				if(map.size()>0){//���ϴ��ļ�
					Field field=hanm.getBean().getClass().getDeclaredField("mimeRule");		   
					field.setAccessible(true);//ȡ��������ķ�װ
					String mimeRule=(String) field.get(hanm.getBean());
					System.out.println(mimeRule);
					String resultMime [] =mimeRule.split(",");
					Iterator<Map.Entry<String,MultipartFile>> iter=map.entrySet().iterator();
					while(iter.hasNext()){
						Map.Entry<String,MultipartFile> me=iter.next();
						
						String paramName = me.getKey();//ȡ���ϴ��ļ�������
						
						MultipartFile file=me.getValue();//ȡ���ϴ��ļ�������
						
						System.out.println("���ļ����ơ��� "+paramName+",���ļ����ݡ��� "+file);
						for (int i = 0; i < resultMime.length; i++) {
							if(!this.isExist(resultMime, file.getContentType())){
								errors.put(paramName, "�ϴ��˷Ƿ��ļ�");
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


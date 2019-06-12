package com.lrw.controller;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lrw.service.MemberService;
import com.lrw.util.MD5utils;
import com.lrw.vo.Member;

@Controller
@RequestMapping("/member")
public class MemberController {
    @Resource
	private MemberService memberservice;
    /**
     * ����ע�ᣬֻ��Ҫ�û���дusername,��password
     * @param vo
     * @return
     * @throws Exception
     */
    @RequestMapping("addMember")
    private String addMember(Member vo) throws Exception{
    	String password = vo.getPassword();
    	String passwordPlus = MD5utils.encryptPassword(password, vo.getUsername());
    	vo.setPassword(passwordPlus);
    	vo.setBirthday(new Date());
    	if(this.memberservice.add(vo)){    		
    		return "index";
    	}else{
    		return "error";
    	}
    }
    /**
     * �û�������Ϣ��Ҫ��д������ֻ���
     * @param vo
     * @return
     * @throws Exception
     */
    @RequestMapping("updateMember")
    public String updateMember(Member vo) throws Exception{
    	if(this.memberservice.update(vo)){
    	return "index";
    	}else{
    		return "error";
    	}
    }
    /**
     * ��ѯ�����еĿɵ�¼�û�
     * @return
     * @throws Exception
     */
    @RequestMapping("list")
    @ResponseBody
    public List<Member> list() throws Exception {
    	return this.memberservice.list();
    }
    
    public Member findOne(int mid) throws Exception{
    	return this.memberservice.findById(mid);
    }
    
    
    
    
    /**
     * �����û��Ļ�Ա�ȼ�
     * @param vo ��������vo����username,mid
     * @return
     * @throws Exception
     */
    @RequestMapping("updateLevel")
    public String updateMemberLevel(Member vo) throws Exception{
    	if(this.memberservice.upMemberLevel(vo)){
    	return "index";
    	}else{
    		return "error";
    	}
    }
    /**
     * �����û���״̬�����ô˷���������û����Խ��е�¼���򽫱�Ϊ���ɵ�¼��������ܽ��е�¼�����Ϊ���Խ��е�¼
     * @param vo 
     * @return
     * @throws Exception
     */
    @RequestMapping("updateStatus")
    public boolean updateMemberStatus(Member vo) throws Exception{
    	if(vo.getStatus()==0){
    	  return this.memberservice.upStatusToBan(vo);
    	}else{
    		return this.memberservice.upStatusToAllow(vo);
    	}
    }
    /**
     * �����û��ĵ�¼��������������ݿ���ڸ��û��������룬��status=0,��ô�������¼
     * @param vo
     * @return
     * @throws Exception
     */
    @RequestMapping("login")
    public String memberLogin(Member vo,HttpServletRequest request,@RequestParam(name="randcode")String randcode) throws Exception{
    	if(randcode!=null&&request.getSession().getAttribute("randomCode").equals(randcode)){//������֤ ��֤�룬�����֤�벻�ԣ�ʣ�µ�Ҳ������
    		String password = vo.getPassword();
        	String passwordPlus = MD5utils.encryptPassword(password, vo.getUsername());
        	vo.setPassword(passwordPlus);
    		if(this.memberservice.login(vo)!=null){
    			request.setAttribute("msg", "��¼�ɹ�����ӭ���ĵ�¼");
          		request.setAttribute("url", "/index.jsp");
        		return "forward";
    	  }else{
    		request.setAttribute("msg", "�û������������");
      		request.setAttribute("url", "/login.jsp");
    		return "forward";
    	 }
    	}else{
    		request.setAttribute("msg", "��֤�����������֤��");
    		request.setAttribute("url", "/login.jsp");
    		return "forward";
    	}
    }
    /**
     * ����û����Ƿ��ظ����ظ�����true,���ظ�����false
     * @param username
     * @return
     * @throws Exception
     */
    @RequestMapping("checkUsername")
    public boolean checkusername(String username) throws Exception{
    	if(this.memberservice.checkUsername(username)!=null){
    		return true;
    	}else{
    		return false;
    	}
    }
    
    
    
    
    
    
    
    
}

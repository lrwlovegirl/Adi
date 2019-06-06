package com.lrw.controller;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lrw.service.MemberService;
import com.lrw.util.MD5utils;
import com.lrw.vo.Member;

@Controller
@RequestMapping("/member")
public class MemberController {
    @Resource
	private MemberService memberservice;
    /**
     * 初步注册，只需要用户填写username,和password
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
     * 用户完善信息需要填写邮箱和手机号
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
     * 查询出所有的可登录用户
     * @return
     * @throws Exception
     */
    @RequestMapping("list")
    public List<Member> list() throws Exception {
    	return this.memberservice.list();
    }
    
    public Member findOne(int mid) throws Exception{
    	return this.memberservice.findById(mid);
    }
    
    
    
    
    /**
     * 更新用户的会员等级
     * @param vo 传过来的vo含有username,mid
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
     * 更改用户的状态，调用此方法，如果用户可以进行登录，则将变为不可登录，如果不能进行登录，则变为可以进行登录
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
     * 进行用户的登录检查操作，如果数据库存在该用户名和密码，且status=0,那么就允许登录
     * @param vo
     * @return
     * @throws Exception
     */
    @RequestMapping("login")
    public boolean memberLogin(Member vo) throws Exception{
    	if(this.memberservice.login(vo)!=null){
    		return true;
    	}else{
    		return false;
    	}
    }
    /**
     * 检查用户名是否重复，重复返回true,不重复返回false
     * @param username
     * @return
     * @throws Exception
     */
    public boolean checkusername(String username) throws Exception{
    	if(this.memberservice.checkUsername(username)!=null){
    		return true;
    	}else{
    		return false;
    	}
    }
    
    
    
    
    
    
    
    
}

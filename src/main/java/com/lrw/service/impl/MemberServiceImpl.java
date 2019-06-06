package com.lrw.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lrw.dao.IMemberDAO;
import com.lrw.service.MemberService;
import com.lrw.vo.Member;
@Service
public class MemberServiceImpl implements MemberService {
    @Resource
	private IMemberDAO memberdao;
	
	public boolean add(Member vo) throws Exception {
	    
		return this.memberdao.doCreateFirst(vo);
	}

	public boolean update(Member vo) throws Exception {
		
		return this.memberdao.doCreateFirst(vo);
	}

	public boolean upMemberLevel(Member vo) throws Exception {
		if(vo.getIntgral()>50000){
		return this.memberdao.doUpdateMemberLevel(vo);
		}else{
			return false;
		}
	}

	public List<Member> list() throws Exception {
		return this.memberdao.findAll();
	}

	public Member findById(int mid) throws Exception {
		
		return this.memberdao.findById(mid);
	}

	public boolean upStatusToBan(Member vo) throws Exception {
		return this.memberdao.upStatusToBan(vo);
	}

	public boolean upStatusToAllow(Member vo) throws Exception {
		return this.memberdao.upStatusToAllow(vo);
	}

	public Member login(Member vo) throws Exception {
		return this.memberdao.login(vo);
	}

	public Object checkUsername(String username) throws Exception {
		// TODO Auto-generated method stub
		return this.memberdao.checkUsername(username);
	}

}

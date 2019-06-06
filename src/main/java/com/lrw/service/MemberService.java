package com.lrw.service;



import java.util.List;

import com.lrw.vo.Member;


public interface MemberService {
   public boolean add(Member vo) throws Exception;
   
   public boolean update(Member vo) throws Exception;
   
   public boolean upMemberLevel(Member vo) throws Exception;
   
   public List<Member> list() throws Exception;

   public Member findById(int mid) throws Exception;
  
   public boolean upStatusToBan(Member vo)throws Exception;

   public boolean upStatusToAllow(Member vo) throws Exception;

   public Member login(Member vo) throws Exception;

   public Object checkUsername(String username)throws Exception;
}

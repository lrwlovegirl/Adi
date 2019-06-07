package com.lrw.dao;

import java.util.List;

import com.lrw.vo.Member;

public interface IMemberDAO {
	/**
	 * 进行初部的注册，只添加usernmae和password
	 * @return
	 * @throws Exception
	 */
  public boolean doCreateFirst(Member vo) throws Exception;
  
  /**
   * 用户的登录操作
   * @param vo
   * @return
   * @throws Exception
   */
  public Member login(Member vo) throws Exception;
  
  
  
  
  /**
   * 完善用户的信息
   * @param vo 传过来的参数包含了 mid,username,password
   * @return
   * @throws Exception
   */
  public boolean doUpdateMember(Member vo) throws Exception;
  /**
   * 更改用户的会员等级，如果积分大于50000，升级为高级会员，高级会员可享受0.8折优惠
   * @param vo 传过来的参数包含mid，username
   * @return
   * @throws Exception
   */
  public boolean doUpdateMemberLevel(Member vo) throws Exception;
  /**
   * 查询出所有的可登录用户，status=0,表示可以正常登陆，=1，表示不可以进行登录
   * @return
   * @throws Exception
   */
  public List<Member> findAll() throws Exception;
  /**
   * 根据编号查询出用户 
   * @param mid
   * @return
   */
  public Member findById(int mid);
  
  /**
   * 将用户变为不可等录状态
   * @param vo 包含mid参数
   * @return
   */
  public boolean upStatusToBan(Member vo);
  /**
   * 将用户变为可登录状态
   * @param vo  包含mid参数
   * @return
   */
  public boolean upStatusToAllow(Member vo);
  /**
   * 检查用户名是否可用
   * @param username 用户注册时输入的用户名
   * @return
   */
  public boolean checkUsername(String username);
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}

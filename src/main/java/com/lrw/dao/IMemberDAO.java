package com.lrw.dao;

import java.util.List;

import com.lrw.vo.Member;

public interface IMemberDAO {
	/**
	 * ���г�����ע�ᣬֻ���usernmae��password
	 * @return
	 * @throws Exception
	 */
  public boolean doCreateFirst(Member vo) throws Exception;
  
  /**
   * �û��ĵ�¼����
   * @param vo
   * @return
   * @throws Exception
   */
  public Member login(Member vo) throws Exception;
  
  
  
  
  /**
   * �����û�����Ϣ
   * @param vo �������Ĳ��������� mid,username,password
   * @return
   * @throws Exception
   */
  public boolean doUpdateMember(Member vo) throws Exception;
  /**
   * �����û��Ļ�Ա�ȼ���������ִ���50000������Ϊ�߼���Ա���߼���Ա������0.8���Ż�
   * @param vo �������Ĳ�������mid��username
   * @return
   * @throws Exception
   */
  public boolean doUpdateMemberLevel(Member vo) throws Exception;
  /**
   * ��ѯ�����еĿɵ�¼�û���status=0,��ʾ����������½��=1����ʾ�����Խ��е�¼
   * @return
   * @throws Exception
   */
  public List<Member> findAll() throws Exception;
  /**
   * ���ݱ�Ų�ѯ���û� 
   * @param mid
   * @return
   */
  public Member findById(int mid);
  
  /**
   * ���û���Ϊ���ɵ�¼״̬
   * @param vo ����mid����
   * @return
   */
  public boolean upStatusToBan(Member vo);
  /**
   * ���û���Ϊ�ɵ�¼״̬
   * @param vo  ����mid����
   * @return
   */
  public boolean upStatusToAllow(Member vo);
  /**
   * ����û����Ƿ����
   * @param username �û�ע��ʱ������û���
   * @return
   */
  public boolean checkUsername(String username);
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}

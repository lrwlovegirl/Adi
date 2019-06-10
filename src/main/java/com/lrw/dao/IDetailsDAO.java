package com.lrw.dao;

import com.lrw.vo.Details;

public interface IDetailsDAO {
	/**
	 * ����������ʱ��Ӧ���Զ�������������
	 * @param vo
	 * @return
	 * @throws Exception
	 */
  public boolean doCreateDetaisl(Details vo) throws Exception;
  /**
   * �û����ĳ������ʱ����ѯ����Ӧ�Ķ�������
   * @param odid
   * @return
   * @throws Exception
   */
  public Details findByOdid(int odid) throws Exception;
}

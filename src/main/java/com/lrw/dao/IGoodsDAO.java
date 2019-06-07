package com.lrw.dao;

import java.util.List;

import com.lrw.vo.Goods;

public interface IGoodsDAO {
	/**
	 * ������Ʒ������
	 * @param vo������һ���˵��������˵��������˵�����Ʒ���ƣ������������������ڣ��۸񣬿�棬��Ƭ
	 * @return
	 * @throws Exception
	 */
   public boolean doCreateGood(Goods vo) throws Exception;
  
    /**
     * ���ݱ�Ÿ���ĳ����Ʒ����Ϣ   
     * @param vo
     * @return
     * @throws Exception
     */
   public boolean updateGoods(Goods vo) throws Exception;
   /**
    * ��ѯ�����е���Ʒ��Ϣ��������Ʒ��ţ�һ���˵��������˵��������˵�����Ʒ���ƣ������������������ڣ��۸񣬿�棬��Ƭ
    * ���ϼ�״̬
    * @return
    * @throws Exception
    */
   public List<Goods> findAllGoods() throws Exception;
   /**
    * ��ѯ�����е��ϼ���Ʒ��Ϣ
    * @return
    * @throws Exception
    */
   public List<Goods> findAllAllowGoods() throws Exception;
   /**
    * ��ѯ�����е��¼���Ʒ��Ϣ
    * @return
    * @throws Exception
    */
   public List<Goods> findAllBanGoods()throws Exception;
   
   /**
    * ���ݱ�Ų�ѯ��ĳ����Ʒ
    * @param gid 
    * @return ������Ʒ��ţ�һ���˵��������˵��������˵�����Ʒ���ƣ������������������ڣ��۸񣬿�棬��Ƭ
    * ���ϼ�״̬
    * @throws Exception
    */
   public Goods findById(int gid) throws Exception;
   /**
    * ����id����ĳ����Ʒ�¼ܣ����ǽ�status��Ϊ1
    * @param gid
    * @return
    * @throws Exception
    */
   public boolean changeStatusToBan(int gid) throws Exception;
   /**
    * ����id����ĳ����Ʒ�ϼ�
    * @param gid
    * @return
    * @throws Exception
    */
   public boolean changeStatusToAllow(int gid) throws Exception;
   /**
    * ����id���޸���Ʒ�Ŀ����
    * @param gid
    * @param count �����Ժ�Ŀ��
    * @return
    * @throws Exception
    */
   public boolean changeCount(int gid,int count) throws Exception;
}

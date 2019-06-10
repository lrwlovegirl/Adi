package com.lrw.dao;

import java.util.List;

import com.lrw.vo.Address;

public interface IAddressDAO {
  /**
   * ���е�ַ�����Ӳ���
   * @param vo
   * @return
   * @throws Exception
   */
   public boolean doCreateAddress(Address vo) throws Exception;
   /**
    * ɾ����ַ
    * @param aid ��ַ�ı��
    * @return
    * @throws Exception
    */
   public boolean doRemoveAddress(int aid) throws Exception;
   /**
    * ���µ�ַ����Ҫaddress����aid
    * @param vo
    * @return
    * @throws Exception
    */
   public boolean updateAddress(Address vo) throws Exception;
   /**
    * ��ѯ��ĳ���û��µ����е�ַ
    * @return
    * @throws Exception
    */
   public List<Address> findAll(int mid) throws Exception;
   /**
    * ���ݱ�Ų�ѯ��ĳ����ַ
    * @param aid
    * @return
    * @throws Exception
    */
   public Address findByAid(int aid) throws Exception;
   
}

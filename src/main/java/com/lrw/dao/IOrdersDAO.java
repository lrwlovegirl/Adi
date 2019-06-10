package com.lrw.dao;

import java.util.List;

import com.lrw.vo.Orders;

public interface IOrdersDAO {
     /**
      *���ж����Ĵ���
      * @param vo
      * @return
      * @throws Exception
      */
	 public boolean doCreateOrders(Orders vo) throws Exception;
	/**
	 * ���ж����ĸ���
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	 public boolean updateOrderByOid(Orders vo) throws Exception;
	 /**
	  * ��ѯ��ĳ���û������ж�����Ϣ
	  * @param mid
	  * @return
	  * @throws Exception
	  */
	 public List<Orders> findAllByMid(int mid) throws Exception;
	 /**
	  * ��ѯ�������û������ж���
	  * @return
	  * @throws Exception
	  */
	 public List<Orders> findAll() throws Exception;
}

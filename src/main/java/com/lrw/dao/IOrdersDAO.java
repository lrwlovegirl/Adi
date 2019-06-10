package com.lrw.dao;

import java.util.List;

import com.lrw.vo.Orders;

public interface IOrdersDAO {
     /**
      *进行订单的创建
      * @param vo
      * @return
      * @throws Exception
      */
	 public boolean doCreateOrders(Orders vo) throws Exception;
	/**
	 * 进行订单的更新
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	 public boolean updateOrderByOid(Orders vo) throws Exception;
	 /**
	  * 查询出某个用户的所有订单信息
	  * @param mid
	  * @return
	  * @throws Exception
	  */
	 public List<Orders> findAllByMid(int mid) throws Exception;
	 /**
	  * 查询出所有用户的所有订单
	  * @return
	  * @throws Exception
	  */
	 public List<Orders> findAll() throws Exception;
}

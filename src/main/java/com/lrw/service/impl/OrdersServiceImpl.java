package com.lrw.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lrw.dao.IOrdersDAO;
import com.lrw.service.OrdersService;
import com.lrw.vo.Orders;
@Service
public class OrdersServiceImpl  implements OrdersService{
     @Resource
	 private IOrdersDAO ordersDAO;
	
	public boolean addOrders(Orders vo) throws Exception {
		return this.ordersDAO.doCreateOrders(vo);
	}

	public boolean updateOrders(Orders vo) throws Exception {
		return this.ordersDAO.updateOrderByOid(vo);
	}

	public List<Orders> listByMid(int mid) throws Exception {
		return this.ordersDAO.findAllByMid(mid);
	}

	public List<Orders> list() throws Exception {
		return this.ordersDAO.findAll();
	}

}

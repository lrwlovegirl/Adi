package com.lrw.service;

import java.util.List;

import com.lrw.vo.Orders;

public interface OrdersService {
  public boolean addOrders(Orders vo) throws Exception;
  
  public boolean updateOrders(Orders vo) throws Exception;
  
  public List<Orders> listByMid(int mid) throws Exception;
  
  public List<Orders> list() throws Exception;
}

package com.lrw.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lrw.service.DetailsService;
import com.lrw.service.OrdersService;
import com.lrw.vo.Details;
import com.lrw.vo.Orders;

@Controller
@RequestMapping("/orders")
public class OrdersController {
     @Resource
	 private OrdersService orderservice;
     @Resource
     private DetailsService detailsService;
     /**
      * 进行订单的创建
      * @param vo
      * @return
      * @throws Exception
      */
     @RequestMapping("addOrders")
     public String addOrders(Orders vo) throws Exception{
    	  if(vo==null){
    		  return "error";
    	  }else{
    		  this.orderservice.addOrders(vo);
    		  Details det = new Details();
    		  det.setOid(vo.getOid());
    		  System.err.println("-----------------这里要报错，因为没传参--------------");
    		  this.detailsService.addDetails(det);
    		  return "index";
    	  }
    	  
     }
     
     @RequestMapping("updateOrders")
     public String updateOrders(Orders vo) throws Exception{
    	  if(vo==null){
    		  return "error";
    	  }else{
    		  this.orderservice.updateOrders(vo);
    		  return "index";
    	  }
    	  
     }
     @RequestMapping("findOrders")
     @ResponseBody
     public List<Orders> findAllById(int mid) throws Exception{
    	 return this.orderservice.listByMid(mid);
    	  
     }
}
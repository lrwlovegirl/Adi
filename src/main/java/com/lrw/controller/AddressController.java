package com.lrw.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lrw.service.AddressService;
import com.lrw.vo.Address;

@Controller
@RequestMapping("/Address")
public class AddressController {
	@Resource
   private AddressService addressService;
	/**
	 * 进行地址的添加操作
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("addAddress")
   public String addAddress(Address vo) throws Exception{
	   if(vo==null){
		   return "error";
	   }else {
		   this.addressService.addAddress(vo);
		   return "index";
	   }	   
   }
	/**
	 * 进行地址的更新操作
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("updateAddress")
   public String updateAddress(Address vo) throws Exception{
	   if(vo==null){
		   return "error";
	   }else {
		   this.addressService.updateAddress(vo);
		   return "index";
	   }
   }
	/**
	 * 列出某个用户的所有地址
	 * @param mid
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("listAddress")
	@ResponseBody
	public List<Address> listAddress(int mid) throws Exception{
		return this.addressService.list(mid);
	}
	/**
	 * 查询出某个地址
	 * @param aid
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("findByAid")
	@ResponseBody
	public Address findByAid(int aid) throws Exception{
		return this.findByAid(aid);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

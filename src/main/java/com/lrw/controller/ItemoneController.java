package com.lrw.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lrw.service.ItemoneService;
import com.lrw.vo.Itemone;

@Controller
@RequestMapping("/Itemone")
public class ItemoneController {
   @Resource
   private ItemoneService itemoneservice;
   /**
    * ����һ���˵�������
    * @param vo
    * @return
    * @throws Exception
    */
    @RequestMapping("additemone")
   public String addItemone(Itemone vo) throws Exception{
	   if( this.itemoneservice.addItemone(vo)){
		   return "index";
	   }else{
		   return "error";
	   }
   }  
    /**
     * ����һ���˵���ɾ��
     * @param ioid
     * @return
     * @throws Exception
     */
    @RequestMapping("deleteItemone")
   public String deleteItemone(int ioid) throws Exception{
	   if( this.itemoneservice.deleteItemone(ioid)){
		   return "index";
	   }else{
		   return "error";
	   }
   }
    /**
     * ����һ������ĸ���
     * @param vo
     * @return
     * @throws Exception
     */
    @RequestMapping("updateItemone")
    public String updateItemone(Itemone vo) throws Exception{
    	 if( this.itemoneservice.updateItemone(vo)){
  		   return "index";
  	     }else{
  		   return "error";
  	     }
    }
    /**
     * ��ѯ�����е�һ������
     * @return
     * @throws Exception
     */
    @RequestMapping("listItemone")
    public List<Itemone> list() throws Exception{
    	return this.itemoneservice.list();
    }
    /**
     * ���ݱ�Ų�ѯ��ĳ��һ������
     * @param ioid
     * @return
     * @throws Exception
     */
    public Itemone findItemoneById(int ioid) throws Exception{
    	return this.itemoneservice.findById(ioid);
    }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
}

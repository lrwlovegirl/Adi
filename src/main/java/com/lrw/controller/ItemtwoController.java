package com.lrw.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lrw.service.ItemtwoService;
import com.lrw.vo.Itemone;
import com.lrw.vo.Itemtwo;

@Controller
@RequestMapping("/Itemtwo")
public class ItemtwoController {
     @Resource
	private ItemtwoService itemtwoservice;
   
     /**
      * ���ж����˵�������
      * @param vo
      * @return
      * @throws Exception
      */
      @RequestMapping("additemtwo")
     public String addItemtwo(Itemtwo vo) throws Exception{
  	   if( this.itemtwoservice.addItemtwo(vo)){
  		   return "index";
  	   }else{
  		   return "error";
  	   }
     }  
      /**
       * ���ж����˵���ɾ��
       * @param itid
       * @return
       * @throws Exception
       */
      @RequestMapping("deleteItemtwo")
     public String deleteItemtwo(int itid) throws Exception{
  	   if( this.itemtwoservice.deleteItemtwo(itid)){
  		   return "index";
  	   }else{
  		   return "error";
  	   }
     }
      /**
       * ���ж�������ĸ���
       * @param vo
       * @return
       * @throws Exception
       */
      @RequestMapping("updateItemtwo")
      public String updateItemtwo(Itemtwo vo) throws Exception{
      	 if( this.itemtwoservice.updateItemtwo(vo)){
    		   return "index";
    	     }else{
    		   return "error";
    	     }
      }
      /**
       * ��ѯ�����еĶ�������
       * @return
       * @throws Exception
       */
      @RequestMapping("listItemtwo")
      public List<Itemtwo> list() throws Exception{
      	return this.itemtwoservice.list();
      }
      /**
       * ���ݱ�Ų�ѯ��ĳ����������
       * @param itid
       * @return
       * @throws Exception
       */
      @RequestMapping("findByItid")
      public Itemtwo findItemtwoByItid(int itid) throws Exception{
      	return this.itemtwoservice.findByItid(itid);
      }
      /**
       * ����һ������ı�Ų�ѯ��֮�����еĶ�������
       * @param ioid һ��������
       * @return
       * @throws Exception
       */
      @RequestMapping("findByIoid")
      public List<Itemtwo> findItemtwoByIoid(int ioid) throws Exception{
    	  return this.itemtwoservice.listByIoid(ioid);
      }
      
     
}

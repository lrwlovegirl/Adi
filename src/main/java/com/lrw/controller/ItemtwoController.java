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
      * 进行二级菜单的增加
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
       * 进行二级菜单的删除
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
       * 进行二级标题的更新
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
       * 查询出所有的二级标题
       * @return
       * @throws Exception
       */
      @RequestMapping("listItemtwo")
      public List<Itemtwo> list() throws Exception{
      	return this.itemtwoservice.list();
      }
      /**
       * 根据编号查询出某个二级标题
       * @param itid
       * @return
       * @throws Exception
       */
      @RequestMapping("findByItid")
      public Itemtwo findItemtwoByItid(int itid) throws Exception{
      	return this.itemtwoservice.findByItid(itid);
      }
      /**
       * 根据一级标题的编号查询它之下所有的二级标题
       * @param ioid 一级标题编号
       * @return
       * @throws Exception
       */
      @RequestMapping("findByIoid")
      public List<Itemtwo> findItemtwoByIoid(int ioid) throws Exception{
    	  return this.itemtwoservice.listByIoid(ioid);
      }
      
     
}

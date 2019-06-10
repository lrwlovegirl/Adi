package com.lrw.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lrw.service.ItemtreService;
import com.lrw.vo.Itemtre;
import com.lrw.vo.Itemtwo;

@Controller
@RequestMapping("/Itemtre")
public class ItemtreController {
    @Resource
	private ItemtreService itemtreservice;

    /**
     * 进行三级菜单的增加
     * @param vo
     * @return
     * @throws Exception
     */
     @RequestMapping("additemtre")
    public String addItemtwo(Itemtre vo) throws Exception{
 	   if( this.itemtreservice.addItemtre(vo)){
 		   return "index";
 	   }else{
 		   return "error";
 	   }
    }  
     /**
      * 进行三级菜单的删除
      * @param itid
      * @return
      * @throws Exception
      */
     @RequestMapping("deleteItemtre")
    public String deleteItemtwo(int irid) throws Exception{
 	   if( this.itemtreservice.deleteItemtre(irid)){
 		   return "index";
 	   }else{
 		   return "error";
 	   }
    }
     /**
      * 进行三级标题的更新
      * @param vo
      * @return
      * @throws Exception
      */
     @RequestMapping("updateItemtre")
     public String updateItemtre(Itemtre vo) throws Exception{
     	 if( this.itemtreservice.updateItemtre(vo)){
   		   return "index";
   	     }else{
   		   return "error";
   	     }
     }
     /**
      * 查询出所有的三级标题
      * @return
      * @throws Exception
      */
     @RequestMapping("listItemtre")
     @ResponseBody
     public List<Itemtre> list() throws Exception{
     	return this.itemtreservice.list();
     }
     /**
      * 根据编号查询出某个三级标题
      * @param irid
      * @return
      * @throws Exception
      */
     @RequestMapping("findByIrid")
     @ResponseBody
     public Itemtre findItemoneByIrid(int irid) throws Exception{
     	return this.itemtreservice.findByIrid(irid);
     }
     /**
      * 根据二级标题的编号查询它之下所有的三级标题
      * @param itid 二级标题编号
      * @return
      * @throws Exception
      */
     @RequestMapping("findByIoid")
     @ResponseBody
     public List<Itemtre> findItemtreByItid(int itid) throws Exception{
   	  return this.itemtreservice.listByItid(itid);
     }
}

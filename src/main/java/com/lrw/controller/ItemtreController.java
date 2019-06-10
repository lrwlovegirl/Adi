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
     * ���������˵�������
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
      * ���������˵���ɾ��
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
      * ������������ĸ���
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
      * ��ѯ�����е���������
      * @return
      * @throws Exception
      */
     @RequestMapping("listItemtre")
     @ResponseBody
     public List<Itemtre> list() throws Exception{
     	return this.itemtreservice.list();
     }
     /**
      * ���ݱ�Ų�ѯ��ĳ����������
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
      * ���ݶ�������ı�Ų�ѯ��֮�����е���������
      * @param itid ����������
      * @return
      * @throws Exception
      */
     @RequestMapping("findByIoid")
     @ResponseBody
     public List<Itemtre> findItemtreByItid(int itid) throws Exception{
   	  return this.itemtreservice.listByItid(itid);
     }
}

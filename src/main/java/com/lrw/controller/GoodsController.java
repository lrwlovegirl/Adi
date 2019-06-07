package com.lrw.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lrw.service.GoodsService;
import com.lrw.vo.Goods;

@Controller
@RequestMapping("/Goods")
public class GoodsController {
     @Resource
	private GoodsService goodservice;
    /**
     * ��Ʒ�����Ӳ���
     * @param vo
     * @return 
     * @throws Exception
     */
     @RequestMapping("addGoods")
    public String addGoods(Goods vo) throws Exception{
    	if(this.goodservice.addGoods(vo)){
    		return "index";
    	}else{
    		return "error";
    	}
    } 
     /**
      * ������Ʒ�ĸ��²���
      * @param vo
      * @return
      * @throws Exception
      */
     @RequestMapping("updateGoods")
     public String updateGoods(Goods vo) throws Exception{
    	 if(this.goodservice.updateGoods(vo)){
    		 return "index";
    	 }else{
    		 return "error";
    	 }
     }
     /**
      * ��ѯ�����е���Ʒ
      * @return
      * @throws Exception
      */
     @RequestMapping("listAll")
     public List<Goods> listAll() throws Exception{
    	 return this.goodservice.list();
     }
     /**
      * ��ѯ�����е��ϼ���Ʒ����Ϣ
      * @return
      * @throws Exception
      */
     @RequestMapping("listAllAllowGoods")
     public List<Goods> listAllAllowGoods() throws Exception{
    	 return this.goodservice.listAllAllowGoods();
     }
     /**
      * ��ѯ�����е��¼���Ʒ����Ϣ
      * @return
      * @throws Exception
      */
     @RequestMapping("listAllBanGoods")
     public List<Goods> listAllBanGoods() throws Exception{
    	 return this.goodservice.listAllBanGoods();
     }
     /**
      * ������Ʒ���ϼ��¼���Ϣ�������ƷΪ�ϼ�״̬�����Ϊ�¼�״̬��������¼������Ϊ�ϼ�״̬
      * @param gid ��Ʒ�ı��
      * @return
      * @throws Exception
      */
     @RequestMapping("changeGoodsStatus")
     public String changeGoodsStatus(int gid) throws Exception{
    	 if(this.goodservice.findById(gid).getStatus()==0){//����������ϼ�״̬
    		 this.goodservice.changeStatusToBan(gid);//����Ϊ�¼�״̬
    		 return "index";
    	 }else if(this.goodservice.findById(gid).getStatus()==1){
    		 this.goodservice.changeStatusToAllow(gid);
    		 return "index";
    	 }else{
    		 return "error";
    	 }
     }
     /**
      * ��ѯ��ĳ����Ʒ�Ŀ����
      * @param gid ��Ʒ���
      * @return
      * @throws Exception
      */
     @RequestMapping("findCount")
     public int findCount(int gid) throws Exception{
    	 return this.goodservice.findById(gid).getCount();
     }
     
     /**
      * ����ĳ����Ʒ�Ŀ��
      * @param gid Ҫ���¿�����Ʒ�ı��
      * @param count �û����������
      * @return
      * @throws Exception
      */
     public boolean updateCount(int gid,int count) throws Exception{
    	 int nowcount=this.goodservice.findById(gid).getCount()-count;
    	 return this.goodservice.changeGoosCount(gid, nowcount);
     }
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
}

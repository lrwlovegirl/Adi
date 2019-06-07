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
     * 商品的增加操作
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
      * 进行商品的更新操作
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
      * 查询出所有的商品
      * @return
      * @throws Exception
      */
     @RequestMapping("listAll")
     public List<Goods> listAll() throws Exception{
    	 return this.goodservice.list();
     }
     /**
      * 查询出所有的上架商品的信息
      * @return
      * @throws Exception
      */
     @RequestMapping("listAllAllowGoods")
     public List<Goods> listAllAllowGoods() throws Exception{
    	 return this.goodservice.listAllAllowGoods();
     }
     /**
      * 查询出所有的下架商品的信息
      * @return
      * @throws Exception
      */
     @RequestMapping("listAllBanGoods")
     public List<Goods> listAllBanGoods() throws Exception{
    	 return this.goodservice.listAllBanGoods();
     }
     /**
      * 更改商品的上架下架信息，如果商品为上架状态则更改为下架状态，如果是下架则更改为上架状态
      * @param gid 商品的编号
      * @return
      * @throws Exception
      */
     @RequestMapping("changeGoodsStatus")
     public String changeGoodsStatus(int gid) throws Exception{
    	 if(this.goodservice.findById(gid).getStatus()==0){//如果现在是上架状态
    		 this.goodservice.changeStatusToBan(gid);//更改为下架状态
    		 return "index";
    	 }else if(this.goodservice.findById(gid).getStatus()==1){
    		 this.goodservice.changeStatusToAllow(gid);
    		 return "index";
    	 }else{
    		 return "error";
    	 }
     }
     /**
      * 查询出某件商品的库存量
      * @param gid 商品编号
      * @return
      * @throws Exception
      */
     @RequestMapping("findCount")
     public int findCount(int gid) throws Exception{
    	 return this.goodservice.findById(gid).getCount();
     }
     
     /**
      * 更新某件商品的库存
      * @param gid 要更新库存的商品的编号
      * @param count 用户购买的数量
      * @return
      * @throws Exception
      */
     public boolean updateCount(int gid,int count) throws Exception{
    	 int nowcount=this.goodservice.findById(gid).getCount()-count;
    	 return this.goodservice.changeGoosCount(gid, nowcount);
     }
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
}

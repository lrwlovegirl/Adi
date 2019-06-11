package com.lrw.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

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
    public String addGoods(Goods vo,MultipartFile pic) throws Exception{
    	 System.out.println(pic.getOriginalFilename());
         String [] str =pic.getOriginalFilename().split("\\.");
         System.out.println(str.length);
         String str2=str[str.length-1];
         System.out.println(str2);
     if("png".equals(str2)||"jpeg".equals(str2)||"jpg".equals(str2)||"gif".equals(str2)){//上传图片的要求格式
     	File outFile = new File("/upload"+"/"+pic.getOriginalFilename()) ;
     	if (!outFile.getParentFile().exists()) {			// 输出文件路径不存在
     		outFile.getParentFile().mkdirs() ;			// 创建目录
     	};
     	 InputStream input =pic.getInputStream();
     	 OutputStream output = new FileOutputStream(outFile) ;
          int temp = 0 ;							// 保存每次读取的数据长度
          byte data [] = new byte [2048] ;				// 每次读取1024个字节
          // 将每次读取进来的数据保存在字节数组里面，并且返回读取的个数
          while((temp = input.read(data)) != -1) {			// 循环读取数据
             output.write(data, 0, temp);				// 输出数组
          }
          input.close(); 							// 关闭输入流
          output.close();							// 关闭输出流
          
       }
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
     @ResponseBody
     public List<Goods> listAll() throws Exception{
    	 return this.goodservice.list();
     }
     /**
      * 查询出所有的上架商品的信息
      * @return
      * @throws Exception
      */
     @RequestMapping("listAllAllowGoods")
     @ResponseBody
     public List<Goods> listAllAllowGoods() throws Exception{
    	 return this.goodservice.listAllAllowGoods();
     }
     /**
      * 查询出所有的下架商品的信息
      * @return
      * @throws Exception
      */
     @RequestMapping("listAllBanGoods")
     @ResponseBody
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
     @RequestMapping("updateCount")
     public boolean updateCount(int gid,int count) throws Exception{
    	 int nowcount=this.goodservice.findById(gid).getCount()-count;
    	 return this.goodservice.changeGoosCount(gid, nowcount);
     }
     
         
}

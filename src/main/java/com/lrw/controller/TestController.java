package com.lrw.controller;

import java.io.File;
import java.util.Date;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lrw.service.GoodsService;
import com.lrw.vo.Goods;

@Controller
@RequestMapping("/file")
public class TestController {
     @Resource
	private GoodsService goodsservice;
	
	@RequestMapping("upload")
	public String upload(Goods vo,HttpServletRequest request,Model model) throws Exception{
	  //保存数据库的路径
	  String sqlPath = null; 
	  //定义文件保存的本地路径
      String localPath="D:\\File\\";
      
      
      
      System.out.println(vo.getIoid());
      System.out.println(vo.getItid());
      System.out.println(vo.getIrid());
     
      
      //定义 文件名
      String filename=null;  
      if(!vo.getFile().isEmpty()){  
          //生成uuid作为文件名称  
          String uuid = UUID.randomUUID().toString().replaceAll("-","");  
          //获得文件类型（可以判断如果不是图片，禁止上传）  
          String contentType=vo.getFile().getContentType();  
          //获得文件后缀名 
          String suffixName=contentType.substring(contentType.indexOf("/")+1);
          //得到 文件名
          filename=uuid+"."+suffixName; 
          //文件保存路径
          vo.getFile().transferTo(new File(localPath+filename));  
      }
      //把图片的相对路径保存至数据库
      sqlPath = "/images/"+filename;
      System.out.println(sqlPath);
      vo.setRegdate(new Date());
      vo.setPhoto(sqlPath);
      
      this.goodsservice.addGoods(vo);
      return "index";
	}
}
 
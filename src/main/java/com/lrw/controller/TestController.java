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
	  //�������ݿ��·��
	  String sqlPath = null; 
	  //�����ļ�����ı���·��
      String localPath="D:\\File\\";
      
      
      
      System.out.println(vo.getIoid());
      System.out.println(vo.getItid());
      System.out.println(vo.getIrid());
     
      
      //���� �ļ���
      String filename=null;  
      if(!vo.getFile().isEmpty()){  
          //����uuid��Ϊ�ļ�����  
          String uuid = UUID.randomUUID().toString().replaceAll("-","");  
          //����ļ����ͣ������ж��������ͼƬ����ֹ�ϴ���  
          String contentType=vo.getFile().getContentType();  
          //����ļ���׺�� 
          String suffixName=contentType.substring(contentType.indexOf("/")+1);
          //�õ� �ļ���
          filename=uuid+"."+suffixName; 
          //�ļ�����·��
          vo.getFile().transferTo(new File(localPath+filename));  
      }
      //��ͼƬ�����·�����������ݿ�
      sqlPath = "/images/"+filename;
      System.out.println(sqlPath);
      vo.setRegdate(new Date());
      vo.setPhoto(sqlPath);
      
      this.goodsservice.addGoods(vo);
      return "index";
	}
}
 
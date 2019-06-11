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
     * ��Ʒ�����Ӳ���
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
     if("png".equals(str2)||"jpeg".equals(str2)||"jpg".equals(str2)||"gif".equals(str2)){//�ϴ�ͼƬ��Ҫ���ʽ
     	File outFile = new File("/upload"+"/"+pic.getOriginalFilename()) ;
     	if (!outFile.getParentFile().exists()) {			// ����ļ�·��������
     		outFile.getParentFile().mkdirs() ;			// ����Ŀ¼
     	};
     	 InputStream input =pic.getInputStream();
     	 OutputStream output = new FileOutputStream(outFile) ;
          int temp = 0 ;							// ����ÿ�ζ�ȡ�����ݳ���
          byte data [] = new byte [2048] ;				// ÿ�ζ�ȡ1024���ֽ�
          // ��ÿ�ζ�ȡ���������ݱ������ֽ��������棬���ҷ��ض�ȡ�ĸ���
          while((temp = input.read(data)) != -1) {			// ѭ����ȡ����
             output.write(data, 0, temp);				// �������
          }
          input.close(); 							// �ر�������
          output.close();							// �ر������
          
       }
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
     @ResponseBody
     public List<Goods> listAll() throws Exception{
    	 return this.goodservice.list();
     }
     /**
      * ��ѯ�����е��ϼ���Ʒ����Ϣ
      * @return
      * @throws Exception
      */
     @RequestMapping("listAllAllowGoods")
     @ResponseBody
     public List<Goods> listAllAllowGoods() throws Exception{
    	 return this.goodservice.listAllAllowGoods();
     }
     /**
      * ��ѯ�����е��¼���Ʒ����Ϣ
      * @return
      * @throws Exception
      */
     @RequestMapping("listAllBanGoods")
     @ResponseBody
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
     @RequestMapping("updateCount")
     public boolean updateCount(int gid,int count) throws Exception{
    	 int nowcount=this.goodservice.findById(gid).getCount()-count;
    	 return this.goodservice.changeGoosCount(gid, nowcount);
     }
     
         
}

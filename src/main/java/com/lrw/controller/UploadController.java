package com.lrw.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;


@Controller
@RequestMapping("/upload")
public class UploadController {

@RequestMapping("test")
  public String insert(MultipartFile pic) throws IOException{
	 //System.out.println("数据流"+pic.getInputStream());
	// File inFile = new File("/upload/") ;
		//System.out.println(pic.getName());
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
         return "index";
    }else{
    	return "error";
    }
        
    
  }
}

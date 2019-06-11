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
	 //System.out.println("������"+pic.getInputStream());
	// File inFile = new File("/upload/") ;
		//System.out.println(pic.getName());
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
         return "index";
    }else{
    	return "error";
    }
        
    
  }
}

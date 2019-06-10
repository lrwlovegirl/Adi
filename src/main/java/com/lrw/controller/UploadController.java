package com.lrw.controller;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;


@Controller
@RequestMapping("/upload")
public class UploadController {
  private static String mimeRule="image/jpeg,image/jpg.image/png";
	@RequestMapping("test")
  public String insert(MultipartFile pic) throws IOException{
	 System.out.println("Êý¾ÝÁ÷"+pic.getInputStream());
	
     return "index";
  }
}

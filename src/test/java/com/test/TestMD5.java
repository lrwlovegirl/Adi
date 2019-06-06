package com.test;

import com.lrw.util.MD5utils;

public class TestMD5 {
 public static void main(String[] args) {
	 
	 String pw="123456";
	 
    System.out.println(MD5utils.encryptPassword("123456", "33"));
 }
}

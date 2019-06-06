package com.lrw.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisSessionFactory {
 private static final String CONFIG_FILE="mybatis.cfg.xml";
 private static ThreadLocal<SqlSession> threadLocal =new ThreadLocal<SqlSession>();
 private static SqlSessionFactory factory=null;
 private static InputStream input =null;
 static{
	 rebuildSessionFactory();	 
 }
 
 public static SqlSession getSession(){
	 SqlSession session=threadLocal.get();//ͨ��ThreadLocalȡ��SqlSession
	 if(session==null){
		 if(factory==null){
			 rebuildSessionFactory();
		 }
		 session=factory.openSession();
		 threadLocal.set(session);
	 }
	 return session ;
 }
 /**
  * ȡ�õ�ǰ���ӵ�SqlSession���������ǰû��SqlSession������Ҫͨ��SqlSessionFactory�����µ�SQLSession����
  * @return
  */
 public static SqlSessionFactory getSessionFactory(){
	 return factory;
 }
 public static void rebuildSessionFactory(){//���½����µ�SqlSessionFactory
	 try {
		input=Resources.getResourceAsStream(CONFIG_FILE);//��ȡ�����ļ�
		factory=new SqlSessionFactoryBuilder().build(input);//����SqlSessionFactory
		factory.getConfiguration().addMappers("com.lrw.dao");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
 }
 public static void close(){
    SqlSession session = threadLocal.get();//ͨ��ThreadLoaclȡ��SqlSession
    threadLocal.set(null);//���ThreadLocalԭʼ���������
    if(session!=null){
    	session.close();
    	if(input!=null){
    		try {
				input.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    }
 }
}

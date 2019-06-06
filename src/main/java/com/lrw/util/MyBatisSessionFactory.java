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
	 SqlSession session=threadLocal.get();//通过ThreadLocal取得SqlSession
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
  * 取得当前连接的SqlSession对象，如果当前没有SqlSession，则需要通过SqlSessionFactory创建新的SQLSession对象
  * @return
  */
 public static SqlSessionFactory getSessionFactory(){
	 return factory;
 }
 public static void rebuildSessionFactory(){//重新建立新的SqlSessionFactory
	 try {
		input=Resources.getResourceAsStream(CONFIG_FILE);//读取配置文件
		factory=new SqlSessionFactoryBuilder().build(input);//创建SqlSessionFactory
		factory.getConfiguration().addMappers("com.lrw.dao");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
 }
 public static void close(){
    SqlSession session = threadLocal.get();//通过ThreadLoacl取得SqlSession
    threadLocal.set(null);//清空ThreadLocal原始保存的数据
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

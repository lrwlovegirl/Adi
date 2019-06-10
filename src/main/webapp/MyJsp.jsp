<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>文件上传测试</title>
  

  </head>
  
  <body>
     <h1>文件上传测试</h1>
    <form action="/XIIX/upload/test.action" method="post" enctype="multipart/form-data">
       <input type="file" name="pic"><br>
       <input type="submit" value="上传">
    </form>
  </body>
</html>

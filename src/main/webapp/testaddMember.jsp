<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>人员增加</title>
  
  </head>
  
  <body>
     <h1>人员测试</h1>
    <form action="member/addMember.action" method="post" ">
      username:<input type="text" name="username"><br>
      password:<input type="text" name="password"><br>
    <input type="submit" value="提交">
    </form>
  </body>
</html>

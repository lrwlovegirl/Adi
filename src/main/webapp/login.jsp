<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>阿迪达斯官方商城</title>
    <link href="css/login.css" rel="stylesheet" type="text/css" />
  </head>
  <body>
     <div id="header">
        <ul id="header-ul">
          <li><a href="#">登录</a></li>  
          <li><a href="#">订单追踪</a></li>  
          <li><a href="#">帮助中心 ？</a></li>   
          <li><a href="#">在线客服</a></li>   
        </ul>
    </div>
    <div>
      <form action="/XIIX/member/addMember.action" method="post">
        username: <input type="text" name="username" id="username"/><br>
        password: <input type="text" name="password" id="password"/><br>
        <input type="submit" value="提交">
        
      </form>
    </div>
  </body>
</html>

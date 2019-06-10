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
    <script type="text/javascript" src="js/JQuery-3.4.js"></script>
    <script type="text/javascript">
   $(function(){
	$("#btn").click(function(){
	
	$.ajax({
			url:"/XIIX/Itemone/listItemone.action",
		    type:"post",
		    dataType:"josn",
		    success:function(data){
		    	console.log(data);
		    	alert(data);
		    }
		
			
		})
	})
		
	});
    </script>
  </head>
  <body>
 
      
        username: <input type="text" name="username" id="username"/><br>
        password: <input type="text" name="password" id="password"/><br>
        <input type="button" value="提交" id="btn">
        
      
    </div>
  </body>
</html>

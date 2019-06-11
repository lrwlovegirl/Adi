<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>商品增加测试</title>
  <script type="text/javascript" charset="utf-8" src="js/JQuery-3.4.js"></script>
  <script type="text/javascript" charset="utf-8" src="js/data.js"></script>
<script type="text/javascript" charset="utf-8" src="js/datajs.js"></script>
<script type="text/javascript">
	$(document).ready(function(){init("ioid","","itid","","irid","");});
</script>

  </head>
  
  <body>
     <h1>文件上传测试</h1>
    <form action="/XIIX/file/upload.action" method="post" enctype="multipart/form-data">
      商品名称:<input type="text" name="title"><br>
      商品价格:<input type="text" name="price"><br>
      初始库存:<input type="text" name="count"><br>
      商品描述:<input type="text" name="note" style="width:300px ;height:150px"><br>
      商品类别: <select id="ioid" class="zzjg_sel1"  name="ioid" ></select>
		  <select id="itid" class="zzjg_sel1" name="itid" ></select>
		  <select id="irid" class="zzjg_sel1" name="irid" ></select><br> 
          <input type="file" name="file"><br>  
       <input type="submit" value="提交">
    </form>
  </body>
</html>

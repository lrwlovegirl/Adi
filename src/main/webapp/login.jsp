<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>阿迪达斯官方商城</title>
    <link href="css/login.css" rel="stylesheet" type="text/css" />
    <script type="text/javascript" src="js/JQuery-3.4.js"></script>
	<link rel="stylesheet" type="text/css" href="css/1.css"/>
	<script type="text/javascript" src="js/login.js">
		
	</script>
	<body>
		<div id="all">
			<div id="up">
				<div id="uptext">
					<a href="main.html"><img src="img/adidas.png"/></a>
					<ul class="title">
						<li><a href="#">男子</a></li>
						<li><a href="#">女子</a></li>
						<li><a href="#">儿童 &nbsp;|</a></li>
						<li><a href="#">运动</a></li>
						<li><a href="#">品牌</a></li>
					</ul>
					<ul class="tips">
						<a href="#"><li>订单追踪</li></a>
						<a href="#"><li>帮助中心</li></a>
						<a href="#"><li>在线客服</li></a>
						<a href="login.jsp"><li>登录</li></a>
					</ul>
					<p id="search"><img src="img/search.png"/><input type="text" id="searchinput" placeholder="抢YEEZY"></p>
				
				</div>
				<div id="hid">
					
				</div>
			</div>
			<div id="cen">
				<div id="login">
					<ul>
						<li class="activea" id="list1">
							<a  onclick="denglu()" >
								登录
							</a>
						</li>
						<li id="list2">
							<a  onclick="zhuce()">
								注册
							</a>
						</li>
					</ul>
					<hr>
					<div id="dl">
					<form action="member/login.action" method="post">
						<div id="pusername">
							用户名：<input type="text" name="username" id="dlname" value="" placeholder=" 用户名" onblur="nameText(sp1,dlname)"/><br>
							<span id="sp1"></span>
						</div>
						<div id="ppassword">
							密&nbsp;&nbsp;&nbsp;码：<input type="password" name="password" id="dlpasswd" value="" placeholder=" 密码" onblur="passwdText(sp2,dlpasswd)"/><br>
							<span id="sp2"></span>
						</div>
						<div id="zcyanzhengma">
							验证码：<input type="text" name="randcode" maxlength="4" />
         					<img id="img" src="image.jsp" /><font color="red">${err_code}</font> 
						</div>
						<input type="checkbox" name="remember-me" value="true">记住我
						<a href="#" id="forget">忘记密码？</a>
						<input type="submit" value="登录">
						<!-- <button>登&nbsp;&nbsp;&nbsp;录</button> -->
					</div>
					</form>
					<div id="zc" style="visibility: hidden;">
						<div id="zcname">
							用户名：<input type="text" name="" id="zname" value="" placeholder=" 用户名" onblur="nameText(sp3,zname)"/><br>
							<span id="sp3"></span>
						</div>
						<div id="zcpassword">
							密&nbsp;&nbsp;&nbsp;码：<input type="password" name="" id="zpasswd" value="" placeholder=" 密码" onblur="passwdText(sp4,zpasswd)"/><br>
							<span id="sp4"></span>
						</div>
						
						<div id="zctel">
							手机号：<input type="text" name="" id="tel" value="" placeholder=" 手机号" onblur="telText()"/><br>
							<span id="sp5"></span>
						</div>
						<div id="zcyanzhengma">
							验证码：<input type="text" name="validcode"/>
         					<img id="img" src="image.jsp" /><font color="red"><!--${err_code}--></font>
						</div>
						<button onclick="logon()">注&nbsp;&nbsp;&nbsp;册</button>
				</div>
			</div>
		</div>
		<div id="buttom">
			<div id="btop">
					<a href="#"><img src="img/but.png"/></a>
			</div>
			<div id="bbut">
					<table border="0px" cellspacing="0" cellpadding="0" id="tab">
						<tr>
							<th>产品</th>
							<th>运动</th>
							<th>帮助中心</th>
							<th>网站政策</th>
						</tr>
						<tr>
							<td><a href="#">鞋类</a></td>
							<td><a href="#">跑步</a></td>
							<td><a href="#">关于员工</a></td>
							<td><a href="#">使用条款</a></td>
						</tr>
						<tr>
							<td><a href="#">配件</a></td>
							<td><a href="#">训练</a></td>
							<td><a href="#">尺码表</a></td>
							<td><a href="#">隐私声明</a></td>
						</tr>
						<tr>
							<td><a href="#">最新上市</a></td>
							<td><a href="#">足球</a></td>
							<td><a href="#">adiCLUB会员</a></td>
							<td><a href="#">物流配送规则</a></td>
						</tr>
						<tr>
							<td><a href="#">新品发售日历</a></td>
							<td><a href="#">篮球</a></td>
							<td><a href="#">门店查询</a></td>
							<td><a href="#">退换货规则</a></td>
						</tr>
						<tr>
							<td><a href="#">限量发售</a></td>
							<td><a href="#">户外</a></td>
							<td><a href="#">关于我们</a></td>
							<td><a href="#">下单指南</a></td>
						</tr>
					</table>
					<div id="butt">
						<a href="#"><img src="img/bbb.png"/></a>
					</div>
				</div>
		</div>
		
		</div>
	</body>
</html>

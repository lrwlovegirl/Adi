function nameText(sp,name){
	var name=name.value;
	var a=false;
	if(name==null||name==""){
		sp.innerHTML="<span class='wrong'>用户名不能为空</span>";		
		return a;	
	}else{
		a=true;
		sp.innerHTML="<span></span>";
		return a;
	}
	
	
}
function passwdText(sp,passwd){
	var passwd=passwd.value;
	var a=false;
	if(passwd==null||passwd==""){
		sp.innerHTML="<span class='wrong'>密码不能为空</span>";		
		return a;	
	}else{
		a=true;
		sp.innerHTML="<span></span>";
		return a;
	}

	
}
function telText(){
	var tel=document.getElementById("tel").value;
	var a=false;
	var span=document.getElementById("sp5");
	if(tel==null||tel==""){
		span.innerHTML="<span class='wrong'>电话号码不能为空</span>";
		
		return a;	
	}else{
		a=true;
		span.innerHTML="<span></span>";
		return a;
	}

	
}

function denglu(){
	document.getElementById("list2").className=""
	document.getElementById("list1").className="activea"
	document.getElementById("zc").style.visibility="hidden";
	document.getElementById("dl").style.visibility="visible";
}
function zhuce(){
	document.getElementById("list1").className=""
	document.getElementById("list2").className="activea"
	document.getElementById("zc").style.visibility="initial";
	document.getElementById("dl").style.visibility="hidden";
}

function logon(){
	alert(nameText());
	/*var a=passwdText();
	var b=nameText();
	var c=telText()
	console.log(a+b+c);
	var name=document.getElementById("zname").value;
	var passwd=document.getElementById("zpasswd").value;
	var tel=document.getElementById("tel").value;
	console.log(name+passwd+tel)*/
}
$(function(){
	//鼠标移入一级菜单显示二级菜单
	$(".title li").mouseover(function(){
		$(".title li").removeClass("chosedli");
		$(this).addClass("chosedli");
		console.log($(this).index())
		if($(this).index()==0){
			console.log($("#hid"))
			$("#hid").show();
			$("#hid").empty();
			$("#hid").append("<p>| 男子</p>");
		}else if($(this).index()==1){
			$("#hid").show();
			$("#hid").empty();
			$("#hid").append("<p>| 女子</p>");
		}
	});
	//鼠标移出一级菜单隐藏二级菜单
	$(".title li").mouseout(function(){
		$("#hid").hide();
	});
	$("#hid").mouseover(function(){
		$("#hid").show();
	});
	$("#hid").mouseout(function(){
		$("#hid").hide();
	});
});

  function xx() {
	var img=document.getElementById("img");
	img.src="ValidCodeServlet?time="+new Date().getTime();
}
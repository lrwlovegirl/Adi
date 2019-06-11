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
		//和后台交互，进行一级菜单的显示
		$.ajax({
			url:"Itemone/listItemone.action",
		    type:"post",
		    data:{},
		    dataType:"text",
		    success:function(data){
		    	alert(data)	;
		    }
		
			
		})
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
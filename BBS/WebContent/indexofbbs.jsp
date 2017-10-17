﻿
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Index Page</title>
        <link rel="stylesheet" href="css/bootstrap.css">	
		<link rel="stylesheet" href="css/bootstrap-theme.css">
		<script src="js/bootstrap.js"></script>
        <script src="js/jquery-1.11.3.js"></script>	
		<script type="text/javascript" src="js/jquery-1.11.3.js" ></script>
		<script src="js/index.js" type="text/javascript" charset="utf-8"></script>
         <style type="text/css">
			#whole{width: 1300px;height: 2800px;border: 1px dashed;}
			#header{width:80%;height: 78px;border: 1px solid;margin-left: 8%;}
			#logo{float: left;}
			a:link{color: red;text-decoration: none;}
			a:hover{color: red;text-decoration: none;}
			#reglog{font-size: 11px;margin-left:60%;}
			.h1{float: left;background: red;color: purple;margin-top: 0px;margin-left: 400px;line-height:44px;}
			.form-search{margin-left: 0px;margin-top: 0px;line-height: 44px;}
			.input-medium{height: 32px;margin-left: 5px;width: 300px}
			.btn{margin-left: 3px;height: 36px;}
			#bankuai{width: 80%;margin-left: 8%;height: 1500px;border: 1px dashed darkred;}
			#list{list-style: none;float: left;}
			#list li{float: left;padding-left: 10px;}
			#qqbk{width: 90%;margin-left: 5%;height: 900px;border: 1px dashed darkred;clear: both;}
			#jpbk{width: 90%;margin-left: 5%;height: 900px;border: 1px dashed darkred;display:none ;clear: both;}
			#ssbk{width: 90%;margin-left: 5%;height: 900px;border: 1px dashed darkred;display:none ;clear: both;}
			#gjbk{width: 90%;margin-left: 5%;height: 900px;border: 1px dashed darkred;display:none ;clear: both;}
			#ylbk{width: 90%;margin-left: 5%;height: 900px;border: 1px dashed darkred;display:none ;clear: both;}
			#jsbk{width: 90%;margin-left: 5%;height: 900px;border: 1px dashed darkred;display:none ;clear: both;}
			#cxdiv{clear: both;margin-left: 6%;width: 900px;height: 40px; border: 1px dashed;}
			#day1{width: 30px;}
			#day2{width: 30px;}
			#stream1{width: 30px;}
			#stream2{width: 30px;}
         </style>
    </head>
	   
    <body>
    	<div id="whole">
				<div id="header">
					<img id="logo" src="img/logo.png" height="78px" width="80px" style="margin-left: 120px;">
					<span id="reglog"><a href="">你好！请登录</a>&nbsp;&nbsp;&nbsp;<a href="">免费注册</a></span>
				</div>
				<h1 class="h1" >BBS</h1>
				<form class="form-search">
				  <input type="text" class="input-medium search-query">
				  <button type="submit" class="btn">搜贴</button>
				</form>
				<div id="bankuai">
					<ul id="list">
						<li>
							<a href="#" onclick="ch1()">全区</a>
						</li>
						<li>
						<a href="#" onclick="ch2()">精品</a>	
						</li>
						<li>
							<a href="#" onclick="ch3()">实时</a>
						</li>
						<li>
							<a href="#" onclick="ch4()">国际</a>
						</li>
						<li>
							<a href="#" onclick="ch5()">娱乐</a>
						</li>
						<li >
							<a href="#" onclick="ch6()">军事</a>
						</li>
					</ul>
					<div id="cxdiv" >
					<a href="#" style="padding-left: 50px;">按浏览量查询</a> <a href="#">按时间查询</a> <a href="#">按时间查询</a>
					近期    <select >  
						    <option value="1">1</option>  
						    <option value="3">3</option>  
						    <option value="7">7</option>  
						    <option value="15">15</option> 
						    <option value="30">30</option>  
					</select> 天&nbsp;&nbsp;
					<form action="#" method="post" id="formdtd" style="padding-left: 50px;float: left;">
						<input type="text" name="day1" id="day1" value="" />日到<input type="text" name="day2" id="day2" value=""  onblur="submitform()"/>日
					</form>
					
					<form action="#" method="post" id="formsts" style="float: left;padding-left: 30px;">
						<input type="text" name="stream1" id="stream1" value="" />流量到<input type="text" name="stream2" id="stream2" value=""  onblur="submitform1()"/>流量
					</form><br />
					<span id="tip1" style="padding-left: 10px;"></span>
					</div>
					<div id="qqbk" style="border: 1px dashed;" >
						<div id="qqbk1">
							1
						</div>
					</div>
					<div id="jpbk" style="border: 2px dashed;" >
						2
					</div>
					<div id="ssbk">
						3
					</div>
					<div id="gjbk">
						4
					</div>
					<div id="ylbk">
						5
					</div>
					<div id="jsbk">
						6
					</div>
				
			</div>
 	</body>
</html>
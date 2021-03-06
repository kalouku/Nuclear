<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/8/1
  Time: 14:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<head>
    <title>Title</title>
    <script type="text/javascript" src="../js/jquery-3.2.1.min.js"></script>
    <link rel="stylesheet" href="../plugins/layui/css/layui.css" media="all" />
    <link rel="stylesheet" href="../css/main.css" />
    <link rel="stylesheet" href="css/custManage.css" />
 	<script type="text/javascript">
 	
 	
 	</script>
</head>
<body>
<div id="main">
    <div id="nav">
        <span id="title1">
		  <a href="">客户信息管理 ></a>
		</span>
    </div>
    <div class="layui-btn-group globalHight">
        <button class="layui-btn">帮助</button>
        <button class="layui-btn"><a href="">查询</a></button>
    </div>

    <div>
        <table class="layui-table">
            <tr>
                <td>客户编号</td>
                <td>
                    <input type="text" name="searchCustomerId" id="searchCustomerId" onkeyup="pagelist()">
                </td>
                <td>客户名称</td>
                <td>
                    <input type="text" name="searchCustomerName" id="searchCustomerName" onkeyup="pagelist()">
                </td>
            </tr>
        </table>
        <br/>
        <table class="layui-table">
        <thead>
            <tr>
            <th>客户编号</th>
            <th>客户名称</th>
            <th>客户经理</th>
            <th>客户等级</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody id="customers">
             </tbody>
        </table>
    </div>
<div id="page1"></div>

</div>

</body>
<script src="../plugins/layui/layui.js" charset="utf-8"></script>
<script>
$(pagelist());
	
function pagelist(){
    layui.use(['laypage', 'layer'], function(){
    	
        var laypage = layui.laypage
                ,layer = layui.layer;
        	var totalPage;
		totalPage=ajax(1,5,true);
        laypage({
            cont: 'page1'
            ,limit:5
            
            ,jump:function(obj,first){
            	
            	ajax(obj.curr,obj.limit,first);
	            	
  				}
        	,pages:totalPage
        });

    });
} 
    function ajax(curr,limit,first){
    	$.ajax({
			   type: 'post',
			   async: false,//异步锁定，默认为true
			   url: "/CRM/custManagement/findCustomers",
			   data: {searchCustomerId:$("#searchCustomerId").val(),
				   searchCustomerName:$("#searchCustomerName").val(),
				   currentPage:curr,
				   pageSize:limit
				   },
			   dataType:"json",
			   success:function(pageModel){
				   totalPage = pageModel.totalPage;
				   
				   $("#customers").empty();
				   $.each(pageModel.list,function(index,context){
					   $("#customers").append("<tr><td>"+context.cuostomerid+"</td><td>"+context.company+"</td><td>"+context.username+"</td><td>"+context.ddname+"</td><td><a href='/CRM/custManagement/Customer_showInfo?cuostomerid="+context.cuostomerid+"'> <i class='layui-icon'>&#xe642;</i></a>&nbsp;&nbsp;&nbsp;&nbsp; <a href='/CRM/custManagement/Customer_delete?cuostomerid="+context.cuostomerid+"'><i class='layui-icon'>&#xe640;</i></a>"+"</td></tr>");
				   });
				  
			   }
				  
			 });
    	return totalPage;
    }
</script>
</html>

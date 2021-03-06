<%--
  Created by IntelliJ IDEA.
  User: Amily
  Date: 2017/8/5
  Time: 14:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>库存查询</title>
    <script type="text/javascript" src="../js/jquery-3.2.1.min.js"></script>
    <link rel="stylesheet" href="../plugins/layui/css/layui.css" media="all" />
    <link rel="stylesheet" href="../css/main.css" />
    <link rel="stylesheet" href="css/SelectInventory.css">
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">

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
                <td>产品</td>
                <td>
                    <input type="text" name="searchWId" id="searchWId" onkeyup="pagelist()">
                </td>
                <td>仓库</td>
                <td>
                    <input type="text" name="searchWst" id="searchWst" onkeyup="pagelist()">
                </td>
            </tr>
        </table>
        <br/>
        <table class="layui-table">
        <thead>
            <tr>
            <th>序号</th>
            <th>产品</th>
            <th>仓库</th>
            <th>货位</th>
            <th>件数</th>
            <th>备注</th>
        </tr>
        </thead>
        <tbody id="customers">
            <tr>
                <td>KHO71202001</td>
                <td>北京聪海信息科技有限公司</td>
                <td>小明</td>
                <td>战略合作伙伴</td>
                <td>
                   <a href="custInformation.jsp"> <i class="layui-icon">&#xe642;</i></a>
                    &nbsp;&nbsp;&nbsp;&nbsp; <i class="layui-icon">&#xe640;</i>
                </td>
            </tr>
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
			   url: "/CRM/basicData/findWare",
			   data: {searchWId:$("#ssearchWId").val(),
				      searchWst:$("#searchWst").val(),
				   currentPage:curr,
				   pageSize:limit
				   },
			   dataType:"json",
			   success:function(pageModel){
				   totalPage = pageModel.totalPage;
				   
				   $("#customers").empty();
				   $.each(pageModel.list,function(index,context){
					   $("#customers").append("<tr><td>"+context.wareid+"</td><td>"+context.wareproduct+"</td><td>"+context.ware+"</td><td>"+context.warest+"</td></tr>");
				   });
				  
			   }
				  
			 });
    	return totalPage;
    }
</script>
</html>

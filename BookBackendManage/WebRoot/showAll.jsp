<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
 <%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML>
<html>
  <head>
    <base href="<%=basePath%>">
    <style>
		*{margin:0px;padding:0px;}
		.content{width:1100px;text-align:center;border:solid 1px #000000;margin:0px auto;}
		.search{margin:10px auto;border:solid 1px #000000;}
		ul,li{list-style:none;}
		.addBook{margin-right:900px;}
		.showAll{border:solid 1px #000000;}
		.showAll li{float:left;width:130px;}
		.page li{float:left;
				 width:267px;
		}
		.page li input{
				 width:30px;
		}
	</style>
	
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	
  </head>
  
  <body>
  
  	<div class="content">
    	<h2>图书借阅系统</h2>
    		<div class="search">		
                <form action="" method="post" >
                <ul>
                	<li>图书名称：<input type="text" value=""  /><input type="submit" value="查询" /></li>
                </ul>
                </form>        
    		</div>
            <div class="addBook">

            	<form action="bookTypeQuery.action" method="post">
                	<input type="submit" value="新增" />
                </form>
            </div>
            <div class="showAll">
            	<ul>
                <li>图书编号</li>
                <li>图书分类</li>
                <li>图书名称</li>
                <li>作者</li>
                <li>出版社</li>
                <li>入库时间</li>
                <li>是否借阅</li>
                <li>操作</li>
                </ul>
                <!-- <s:iterator var="type" value="#session.bookType">
                      <option value="<s:property value="#type.id"/>"><s:property value="#type.typeName"/></option>
 				</s:iterator> -->
 				
 				<s:iterator var="book" value="#session.book">
                <ul>
                <li><s:property value="#book.bookCde"/></li>
                <li><s:property value="#book.bookType"/></li>
                <li><s:property value="#book.bookName"/></li>
                <li><s:property value="#book.bookAuthor"/></li>
                <li><s:property value="#book.publishPress"/></li>
                <li><s:property value="#book.creationTime"/></li>
                <li><s:property value="#book.borrowed"/></li>
                <li><a href="">查看</a><a href="">修改</a><a href="">删除</a></li>
                </ul>
                </s:iterator>
               
            </div>
            
            <div class="page">
            	<ul>
            	<li>上一页</li>
            	<li>下一页</li>
            	<li>共XX页</li>
	            	<li><form action="" method="post">
	            		到第<input type="text" value="" />页 <input type="submit" value="确定" />
	            	</form></li>
            	</ul>
            </div>
    </div>
  </body>
</html>

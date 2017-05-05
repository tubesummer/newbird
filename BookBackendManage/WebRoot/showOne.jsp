<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css"> 
	*{margin:0px;padding:0px;}
	.show{width:1000px;border:1px solid #ccc;text-align:center;margin:0px auto;}
	.show ul li{float:left;width:400px;list-style:none;}
s
</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="show">
		<h2>查看图书信息</h2>
		<ul>
		<li>图书编号：<input type="text" value=""  /></li>
		<li>图书名称：<input type="text" value=""  /></li>
		</ul>
		<ul>
		<li>图书类型：<input type="text" value=""  /></li>
		<li>作者：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" value=""  /></li>
		</ul>
		<ul>
		<li>出版社：<input type="text" value=""  /></li>
		<li>是否借阅：<input type="text" value=""  /></li>
		</ul>
		<ul>
		<li>入库人：<input type="text" value=""  /></li>
		<li>入库时间：<input type="text" value=""  /></li>
		</ul>
		<ul><li><a href=""><input type="button" value="返回" /></a></li></ul>
	</div>
</body>
</html>
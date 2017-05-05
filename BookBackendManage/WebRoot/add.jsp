<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css"> 
	*{margin:0px;padding:0px;}
	.show{width:1000px;border:1px solid #ccc;margin:0px auto;}
	h2{text-align:center;}
	.show ul li{float:left;width:480px;list-style:none;margin-left:10px;height:30px;}
s
</style>
<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
<script type="text/javascript">
	$(function(){
		//日期类
		var date = new Date();
		//年 + 1900年开始
		var year = date.getYear()+1900;
		//月
		var month = date.getMonth()+1;
		//日
		var day = date.getDay();
		//结果
		var res = year + "-" + month + "-" + day;
		//入加时间为当前时间
		$("#creationTime").val(res);
		
		//添加数据
		$("#badd").click(function(){
			//图书编号
			var bookCde = $("#bookCde").val();
			//图书名称
			var bookName = $("#bookName").val();
			//图书类型
			var bookType = $("#bookType").val();
			var index = $("#bookType").prop("selectedIndex");
			if(index==0){
				alert("请选择图书的类型");
				return false;
			}
			//作者
			var bookAuthor = $("#bookAuthor").val();
			//出版社
			var publishPress = $("#publishPress").val();
			//是否借阅
			var borrowed = $("#borrowed").val();
			//入库人
			var createdBy = $("#createdBy").val();
			//入库时间
			var creationTime = $("#creationTime").val();
			$.ajax({
				url : "addbook.action",
				type : "post",
				async : false,
				data : {
						"book.bookCde":bookCde,
						"book.bookName":bookName,
						"book.bookType":bookType,
						"book.bookAuthor":bookAuthor,
						"book.publishPress":publishPress,
						"book.borrowed":borrowed,
						"book.createdBy":createdBy,
						"creationTime1":creationTime
				        },
				success:function(param){
					alert(param);
					if(param.equals("新增成功")){
						window.location.href="index.jsp";
					}else{
						window.location.href="add.jsp";
					}
				}
				
			});
		});
		
	});
</script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="show">
		<h2>新增图书信息</h2>
		<form action="" method="post">
		<ul>
		<li>图书编号：<input type="text" id="bookCde"  value=""  /></li>
		<li>图书名称：<input type="text" id="bookName" value=""  /></li>
		</ul>
		<ul>
		<li>图书类型：<select  id="bookType">
					  <option value="0">请选择</option>
				<s:iterator var="type" value="#session.bookType">
                      <option value="<s:property value="#type.id"/>"><s:property value="#type.typeName"/></option>
 				</s:iterator>
					</select></li>
		<li>作者：<input type="text"  id="bookAuthor" value=""  /></li>
		</ul>
		<ul>
		<li>出版社：<input type="text" id="publishPress" value=""  /></li>
			<li>是否借阅：<select  id="borrowed">
						  <option value="0" selected = "selected">未借阅</option>
						  <option value="1">已借阅</option>
						</select>
			</li>
		</ul>
		<ul>
		<li>入库人：<input type="text" id="createdBy" value="系统管理员"  /></li>
		<li>入库时间：<input type="text" id="creationTime" value=""  /></li>
		</ul>
		<ul><li><input type="button" id="badd" value="保存" /></li><li><a href=""><input type="button" value="返回" /></a></li></ul>
		</form>
	</div>
</body>
</html>
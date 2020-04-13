<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>编辑图书</title>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath }/static/css/bootstrap.css">
<!-- 引入js文件 -->
<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/jquery-3.4.1.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/bootstrap.min.js"></script>
</head>
<body>
<form action="UpdateBook" method="post" class="form-inline" role="form">
<div class="container">
	<table>
        <h3 class="text-center">编辑图书</h3>
         	<tr>
         		<td>书名</td>
         		<td><input type="text" class="form-control" id="name" name="name" placeholder="请输入书名"></td>
         	</tr>
         	<tr>
         		<td>作者</td>
         		<td><input type="text" class="form-control" id="author" name="author" value=""></td>
         	</tr>
         	<tr>
         		<td>出版社</td>
         		<td><input type="text" class="form-control" id="publish" name="publish" value=""></td>
         	</tr>
         	<tr>
         		<td>出版日期</td>
         		<td><input type="text" class="form-control" id="publishdate" name="publishdate" placeholder="yyyy-MM-DD"></td>
         	</tr>
         	<tr>
         		<td>页数</td>
         		<td><input type="text" class="form-control" id="Page" name="Page" value=""></td>
         	</tr>
         	<tr>
         		<td>价格</td>
         		<td><input type="text" class="form-control" id="Price" name="Price" value=""></td>
         	</tr>
         	<tr>
         		<td>内容摘要</td>
         		<td><textarea rows="5" cols="20" name="content" id="text1"></textarea></td>
         	</tr>
            <tr>
            	<td><input type="submit" class="form-control btn-primary" value="提交"></td>
            	<td><input type="submit" class="form-control btn-primary" value="返回"></td>
            </tr>
           </table>
	</div>
</form>
</body>
</html>
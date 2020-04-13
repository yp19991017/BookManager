<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>图书详细信息列表</title>
<!-- 引入bootstrap的资源信息 -->
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/static/css/bootstrap.css">
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/static/css/bootstrap-combined.min.css">
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/static/css/layoutit.css">
<!-- 引入js文件 -->
<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/jquery-3.4.1.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/bootstrap.min.js"></script>
</head>
<body>
	<div id="container">
		<h2 class="text-center vitar" style="background-color: pink;">图书详细信息列表</h2>
		
		<table class="table table-hover">
			<tr>
				<th>书名</th>
				<th>作者</th>
				<th>出版社</th>
				<th>出版日期</th>
				<th>页数</th>
				<th>价格</th>
				<th>内容摘要</th>
				<th>操作</th>
			</tr>
			<c:forEach items="${list }" var="b">
		    <tr>
				<td>${b.Name }</td>
				<td>${b.Author }</td>
				<td>${b.publish }</td>
				<td><fmt:formatDate value="${b.publishdate }" pattern="YYYY-MM-DD HH:mm:ss"/></td>
				<td>${b.Page }</td>
				<td>${b.Price }</td>
				<td>${b.Content }</td>
				<td><a href="addbook.jsp">增加</a>&nbsp;&nbsp;
				<a href="Update?id=${b.Name }">修改</a>&nbsp;&nbsp;
				<a href="Delete?id=${b.id } ">删除</a></td>
			</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>
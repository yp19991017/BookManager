<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登录页面</title>
<style type="text/css">
	#container{
		wight:500px;
		height: 500px;
	}
</style>
<!-- 引入bootstrap的资源信息 -->
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath }/static/css/bootstrap.css">
<!-- 引入js文件 -->
<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/jquery-3.4.1.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/static/js/bootstrap.min.js"></script>
</head>
<body>
	<div id="container" >
        
        <form method="post" action="Login">
        <table>
        <h3>登录图书管理系统</h3>
         	<tr>
         		<td>用户名:</td>
         		<td><input name="userId" type="text" value="" ></td>
         	</tr>
         	<tr>
         		<td>密码:</td>
         		<td><input name="userPsw" type="password" value=""></td>
         	</tr>
            <tr>
            	<td><input value="登录"  type="submit"></td>
            </tr></center>
            
            
        
        </table>
       </form>
    </div>
</body>
</html>
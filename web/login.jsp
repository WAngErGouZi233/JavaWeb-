<%--
  Created by IntelliJ IDEA.
  User: ErGou
  Date: 2020/7/18
  Time: 20:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<html>
<head>
    <title>登录注册页面</title>
</head>
<body >

<form action="loginServlet"  method="post"  style="padding-top:-700px;">
    用户名：<input type="text" name="name"value=""><br><br>
    密码：  <input type="password" name="password"value=""><br><br>
    <input type="submit"value="登录"name="login"><input type="reset"value="重置"><br>
</form>

<form action="register.jsp">
    <input type="submit"value="新用户注册">
</form>

</body>
</html>


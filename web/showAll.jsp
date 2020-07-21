<%--
  Created by IntelliJ IDEA.
  User: ErGou
  Date: 2020/7/18
  Time: 20:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="com.entity.MyUser" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.dao.UserDao" %>
<%@ page import="com.dao.UserDaoImplement" %>
<%@ page import="java.lang.ref.ReferenceQueue" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>所有用户页面</title>
</head>

<body>


<%
    String path=request.getContextPath();
    String basepath=request.getScheme()+"://"+ request.getServerName()+":"+request.getServerPort()+"/";
%>

<c:forEach var="U" items="${requestScope.all}"  >
    <form action="updateServlet" method="post">
        <tr>
            <td><input type="text" value="${U.name}" name="name" ></td>
            <td><input type="text" value="${U.password}" name="password"></td>
            <td><input type="text" value="${U.id}" name="id"></td>
            <td><a href="deleteServlet?id=${U.id}">删除</a> <input type="submit" value="更新"/></td>
        </tr>
    </form>
</c:forEach>
</body>
</html>

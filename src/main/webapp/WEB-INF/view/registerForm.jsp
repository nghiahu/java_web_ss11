<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: nghia
  Date: 22/05/2025
  Time: 11:11 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<style>
    .error{
        color: red;
    }
</style>
<body>
<h1>Đăng ký</h1>
<form:form modelAttribute="regisUser" action="register" method="post">
    <label>Tên</label>
    <form:input path="name"/> <br>
    <form:errors path="name" cssClass="error"/> <br>
    <label>Email</label>
    <form:input path="email"/> <br>
    <form:errors path="email" cssClass="error"/> <br>
    <label>Mật khẩu</label>
    <form:input path="password"/> <br>
    <form:errors path="password" cssClass="error"/> <br>
    <input type="submit" value="register">
</form:form>
<c:if test="${not empty mess}">
    <h1>${mess}</h1>
</c:if>
</body>
</html>

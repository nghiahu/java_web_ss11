<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: nghia
  Date: 23/05/2025
  Time: 1:00 SA
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
<h3>Đăng ký</h3>
<form:form modelAttribute="account" action="role-regiter" method="post">
  <label>Tên:</label>
  <form:input path="name"/> <br>
  <form:errors path="name" cssClass="error"/><br>

  <label>Email:</label>
  <form:input path="email"/> <br>
  <form:errors path="email" cssClass="error"/><br>

  <label>Vai trò:</label>
  <form:radiobutton path="role" value="user"/> Người dùng
  <form:radiobutton path="role" value="admin"/> Quản trị viên <br>
  <form:errors path="role" cssClass="error"/><br>

  <div id="adminFields">
    <label>Mã xác minh (cho Admin):</label>
    <form:input path="verificationCode"/> <br>
    <form:errors path="verificationCode" cssClass="error"/><br>
  </div>

  <input type="submit" value="Đăng ký">
</form:form>
<c:if test="${not empty mess}">
  <h1>${mess}</h1>
</c:if>
</body>
</html>

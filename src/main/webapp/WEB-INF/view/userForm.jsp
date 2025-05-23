<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: nghia
  Date: 22/05/2025
  Time: 9:55 CH
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
<h1>Nhập thông tin người dùng</h1>
<form:form modelAttribute="user" action="user-save" method="post">
  <div>
    <label>Name</label>
    <form:input path="name"/> <br>
    <form:errors path="name" cssClass="error"/> <br>
    <label>Email</label>
    <form:input path="email"/>  <br>
    <form:errors path="email" cssClass="error"/><br>
    <label>Phone</label>
    <form:input path="phone"/>  <br>
    <form:errors path="phone" cssClass="error"/> <br>
    <label>Password</label>
    <form:input path="password"/> <br>
    <form:errors path="password" cssClass="error"/> <br>
    <label>Status</label><br>
    <form:radiobutton path="status" value="true" /> Active
    <form:radiobutton path="status" value="false" /> Inactive  <br>
    <input type="submit" value="Submit">
  </div>
</form:form>
<c:if test="${not empty mess}">
  <p style="color:green">${mess}</p>
</c:if>
</body>
</html>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: nghia
  Date: 23/05/2025
  Time: 8:39 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>Đánh giá</h3>
<form:form modelAttribute="evaluate" action="evaluate-save" method="post">
    <label>Tên</label>
    <form:input path="username"/> <br>
    <form:errors path="username" cssStyle="color: red"/> <br>
    <label>Email</label>
    <form:input path="email"/> <br>
    <form:errors path="email" cssStyle="color: red"/> <br>
    <label>Tên</label>
    <form:input path="evaluate"/> <br>
    <form:errors path="evaluate" type="number" cssStyle="color: red"/> <br>
    <label>Tên</label>
    <form:input path="comment"/> <br>
    <form:errors path="comment" cssStyle="color: red"/> <br>
    <input type="submit" value="Đánh giá">
</form:form>
<c:if test="${not empty mess}">
    <h1>${mess}</h1>
</c:if>
</body>
</html>

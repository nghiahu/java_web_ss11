<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: nghia
  Date: 23/05/2025
  Time: 12:24 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form modelAttribute="passwordForm" action="password-save" method="post">
  <label>Mật khẩu</label>
  <form:input path="password"/> <br>
    <form:errors path="password" cssStyle="color: red"/> <br>
  <input type="submit" value="Submit">
</form:form>
<c:if test="${not empty mess}">
    <h1>${mess}</h1>
</c:if>
</body>
</html>

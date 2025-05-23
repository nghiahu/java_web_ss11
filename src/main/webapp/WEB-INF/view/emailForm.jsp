<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: nghia
  Date: 22/05/2025
  Time: 11:51 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form:form modelAttribute="email" action="email-save" method="post">
        <label>Email</label>
        <form:input path="email"/>
        <form:errors path="email" cssStyle="color: red"/>
        <input type="submit" value="Submit">
    </form:form>
<c:if test="${not empty mess}">
    <h1>${mess}</h1>
</c:if>
</body>
</html>

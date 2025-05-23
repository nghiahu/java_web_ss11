<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: nghia
  Date: 19/05/2025
  Time: 4:24 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h4>Movie Form</h4>
<form:form modelAttribute="MovieDTO" action="movie-save" method="post">
    <div>
        <label for="title">Title</label>
        <form:input path="title"/>
        <form:errors path="title" cssClass="error" /> <br>
    </div>
    <div>
        <label for="email">Email</label>
        <form:input path="email"/>
        <form:errors path="email" cssClass="error" /> <br>
    </div>
    <div>
        <label for="quantity">Quantity</label>
        <form:input path="quantity" type="number"/>
        <form:errors path="quantity" cssClass="error" /> <br>
    </div>
    <div>
        <label for="dob">Birthday</label>
        <form:input path="dob" type="date"/>
    </div>
    <div>
        <label for="dateEvent">dataEven</label>
        <form:input path="dateEvent" type="date"/>
    </div>
    <input type="submit" value="Submit">
</form:form>

</body>
</html>

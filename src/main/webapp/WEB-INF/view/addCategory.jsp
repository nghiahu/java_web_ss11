<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Form danh mục</title>
</head>
<body>
<h2>${category.id == 0 ? 'Thêm danh mục' : 'Chỉnh sửa danh mục'}</h2>
<form:form modelAttribute="category" action="${category.id == 0 ? 'category-save' : 'updateCategory'}" method="post">
  <form:hidden path="id"/>
  <label>Tên danh mục</label>
  <form:input path="categoryName"/> <br>
  <form:errors path="categoryName" cssStyle="color:red"/> <br>

  <label>Trạng thái</label> <br>
  <form:radiobutton path="status" value="true"/> True
  <form:radiobutton path="status" value="false"/> False <br>
  <form:errors path="status" cssStyle="color:red"/> <br>

  <input type="submit" value="${category.id == 0 ? 'Thêm' : 'Cập nhật'}">
</form:form>
</body>
</html>

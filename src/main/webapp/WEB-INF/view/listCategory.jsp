<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Danh sách danh mục</title>
</head>
<body>

<h2>Danh sách danh mục</h2>

<a href="addCategory">
    <button>Thêm danh mục</button>
</a>

<table border="1" cellpadding="10" cellspacing="0">
    <thead>
    <tr>
        <th>Mã danh mục</th>
        <th>Tên danh mục</th>
        <th>Trạng thái</th>
        <th>Hành động</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="category" items="${categories}">
        <tr>
            <td>${category.id}</td>
            <td>${category.categoryName}</td>
            <td>
                <c:choose>
                    <c:when test="${category.status}">
                        Đang hoạt động
                    </c:when>
                    <c:otherwise>
                        Ngừng hoạt động
                    </c:otherwise>
                </c:choose>
            </td>
            <td>
                <a href="editCategory?id=${category.id}">
                    <button>Sửa</button>
                </a>
                <a href="deleteCategory?id=${category.id}" onclick="return confirm('Bạn có chắc muốn xóa danh mục này không?');">
                    <button>Xóa</button>
                </a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>

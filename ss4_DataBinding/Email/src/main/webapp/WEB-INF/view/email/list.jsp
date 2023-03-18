<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List Email</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<h1>List Email</h1>
<p>
    <a href="/email/create">Create new Product</a>
</p>
<c:if test="${message != null}">
    <h4>${message}</h4>
</c:if>
<table class="table table-hover">
    <thead>
    <tr>
        <th>ID</th>
        <th>Langueges</th>
        <th>Page Size</th>
        <th>Spams Filter</th>
        <th>Signature</th>
        <th>Action</th>
    </tr>
    <thead>
    <tbody>
    <c:forEach items="${email}" var="emails">
        <tr>
            <td>${emails.id}</td>
            <td>${emails.langueges}</td>
            <td>${emails.pageSize}</td>
            <td>${emails.spamsFilter}</td>
            <td>${emails.signature}</td>
            <td><a href="/email/edit?&id=${emails.id}">Edit</a></td>
        </tr>
    </c:forEach>
    <tbody>
</table>
</body>
</html>

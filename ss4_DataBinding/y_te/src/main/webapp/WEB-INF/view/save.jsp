<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <th>Name</th>
        <th>Date</th>
        <th>Gender</th>
        <th>Country</th>
        <th>CCCD</th>
        <th>Address</th>
        <th>Phone</th>
        <th>Email</th>
    </tr>
    <c:forEach var="person" items="${list}">
        <tr>
            <td><c:out value="${person.name}"></c:out></td>
            <td><c:out value="${person.date}"></c:out></td>
            <td><c:out value="${person.gender}"></c:out></td>
            <td><c:out value="${person.country}"></c:out></td>
            <td><c:out value="${person.cccd}"></c:out></td>
            <td><c:out value="${person.address}"></c:out></td>
            <td><c:out value="${person.phone}"></c:out></td>
            <td><c:out value="${person.email}"></c:out></td>
        </tr>
    </c:forEach>
</table>
<a href="/list">Ke khai</a>
</body>
</html>
</html>

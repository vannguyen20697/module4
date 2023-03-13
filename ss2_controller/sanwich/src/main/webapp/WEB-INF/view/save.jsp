<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Sandwich with: </h1>
<c:forEach items="${condiment}" var="eat">
    <h3>${eat}</h3>
</c:forEach>
</body>
</html>
</html>

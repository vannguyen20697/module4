<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Create Email</title>
</head>
<body>
<h1>Create Email</h1>
<form:form action="/email/create" method="post" modelAttribute="email">
    <table>
        <tr>
            <td>ID</td>
            <td><form:input path="id" /></td>
        </tr>
<%--        <tr>--%>
<%--            <td><form:label path="langueges">langueges</form:label></td>--%>
<%--            <td><form:input path="langueges" /></td>--%>
<%--        </tr>--%>
        <tr>
            <td>langueges</td>
            <td><form:select path="langueges" items="${langueges}"/></td>
        </tr>
        <tr>
            <td>pageSize</td>
            <td><form:select path="pageSize" items="${pageSize}"/></td>
        </tr>
        <tr>
            <td>spamsFilter</td>
            <td><form:input path="spamsFilter" items="${spamsFilter}"/></td>
        </tr>
        <tr>
            <td>signature</td>
            <td><form:textarea path="signature" items="${signature}"/></td>
        </tr>
        <tr>
            <td><input type="reset" value="Reset"></td>
            <td><input type="submit" value="Register"></td>
        </tr>
    </table>
</form:form>
</body>
</html>

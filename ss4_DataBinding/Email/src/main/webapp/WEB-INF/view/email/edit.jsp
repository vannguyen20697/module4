<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Create Email</title>
</head>
<body>
<h1>Update Email</h1>
<form:form method="post" action="/email/update" modelAttribute="email">
    <table>
        <tr>
            <td>id</td>
            <td><form:input path="id" value="${id}"/></td>
        </tr>
        <tr>
            <td>langueges</td>
            <td><form:input path="langueges" value="${langueges}"/></td>
        </tr>
        <tr>
            <td>pageSize</td>
            <td><form:input path="pageSize" value="${pageSize}"/></td>
        </tr>
        <tr>
            <td>spamsFilter</td>
            <td><form:input path="spamsFilter" value="${spamsFilter}"/></td>
        </tr>
        <tr>
            <td>signature</td>
            <td><form:textarea path="signature" value="${signature}"/></td>
        </tr>
        <tr>
            <td><input type="reset" value="Reset"></td>
            <td><input type="submit" value="Submit"></td>
        </tr>
    </table>

</form:form>
</body>
</html>
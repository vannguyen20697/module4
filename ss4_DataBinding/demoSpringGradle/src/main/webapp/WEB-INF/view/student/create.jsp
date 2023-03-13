<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create student</title>
</head>
<body>
  <h1>Create student</h1>
  <form:form action="/student/create" method="post" modelAttribute="student">
    <table>
      <tr>
        <td>ID</td>
        <td><form:input path="id" /></td>
      </tr>
      <tr>
        <td><form:label path="name">Name</form:label></td>
        <td><form:input path="name" /></td>
      </tr>
      <tr>
        <td>Address</td>
        <td><form:select path="address" items="${addresses}"/></td>
      </tr>
      <tr>
        <td><input type="reset" value="Reset"></td>
        <td><input type="submit" value="Register"></td>
      </tr>
    </table>
  </form:form>
</body>
</html>

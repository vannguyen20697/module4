<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<h1>Calculator</h1>
<form action="/display" method="post">
    <input type="text" name="number1" value="${number1}">
    <input type="text" name="number2" value="${number2}">
    <p>
        <input type="submit" name="cal" value="Addition(+)">
        <input type="submit" name="cal" value="Subtraction(-)">
        <input type="submit" name="cal" value="Multiplication(X)">
        <input type="submit" name="cal" value="Division(/)">
    </p>
</form>
<h2>Result: ${result}</h2>
</body>
</html>
</html>

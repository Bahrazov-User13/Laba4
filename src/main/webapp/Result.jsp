<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Результат</title>
</head>
<body>
        <h1>Площадь круга</h1>
            <h3>Радиус: ${f_result}</h3>
            <h3>Результат: ${result}</h3>
        <form action="${pageContext.request.contextPath}/Form.jsp">
        </form>
</body>
</html>
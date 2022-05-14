<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Calculator</title>
</head>
<body>
        <h1>Площадь круга</h1>

        <form class="calc" action="${pageContext.request.contextPath}/JavaCalc" method="post">
              <label for="radius">Радиус:</label>
              <input type="text" class="form-control form-control-lg" name="radius" id="radius" placeholder="Введите число">
            <button type="submit" id="button_form">Вычислить</button>
          </form>
</body>
</html>
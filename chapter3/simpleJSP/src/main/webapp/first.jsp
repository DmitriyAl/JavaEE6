<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: Андрей
  Date: 10.06.2016
  Time: 12:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Время Сервера</title>
</head>
<body>
<p>Server time: <% out.print(new Date());%></p>
</body>
</html>

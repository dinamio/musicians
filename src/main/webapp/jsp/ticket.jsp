<%--
  Created by IntelliJ IDEA.
  User: Jenja
  Date: 24.05.2017
  Time: 19:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Ticket details</title>
</head>
<body>
Цена: <label>${ticket.price}</label> <br>
Название события: <label>${ticket.event.name}</label> <br>
Дата: <label>${ticket.event.date}</label> <br>
Место проведения: <label>${ticket.event.area.name}</label> <br>
<label>${ticket.event.area.address}</label> <br>
</body>
</html>

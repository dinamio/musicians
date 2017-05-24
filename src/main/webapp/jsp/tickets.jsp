<%--
  Created by IntelliJ IDEA.
  User: Jenja
  Date: 24.05.2017
  Time: 19:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c"
           uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <style>
        table {
            font-family: arial, sans-serif;
            border-collapse: collapse;
            width: 100%;
        }

        td, th {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }

        tr:nth-child(even) {
            background-color: #dddddd;
        }
    </style>
    <title>Ticket</title>
</head>
<body>
<table>
    <tr>
        <th>Цена</th>
        <th>Название события</th>
        <th>Дата</th>
        <th>Действия</th>
    </tr>
    <c:forEach items="${tickets}" var="ticket">
        <tr>
            <td>${ticket.price}</td>
            <td>${ticket.event.name}</td>
            <td>${ticket.event.date}</td>
            <td>
                <ul>
                    <li><a href="${pageContext.request.contextPath}/ticket/${ticket.id}">Показать</a></li>
                    <li><a href="${pageContext.request.contextPath}/ticket/delete/${ticket.id}">Удалить</a></li>
                </ul>
            </td>
        </tr>
    </c:forEach>
</table>
<a href="${pageContext.request.contextPath}/ticket/new">Добавить билет</a>

</body>
</html>

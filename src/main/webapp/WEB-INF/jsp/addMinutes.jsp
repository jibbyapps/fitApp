<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: vitaliiromanchenko
  Date: 26.03.16
  Time: 10:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add minutes page</title>
</head>
<body>
<h1> add minutes rock n roll</h1>

Language: <a href="?language=en">English</a> | <a href="?language=es">Spanish</a>
<form:form commandName="exercise">
    <table>
        <tr>
            <td>
               <spring:message code="goal.text"/>
            </td>

            <td>
                <form:input path="minutes"/>
            </td>

        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="Enter Exercise button">

            </td>
        </tr>


    </table>
</form:form>

<h1> our Goal for today: ${goal.minutes}</h1>
</body>
</html>

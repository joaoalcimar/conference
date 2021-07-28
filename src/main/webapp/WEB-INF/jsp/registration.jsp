<%--
  Created by IntelliJ IDEA.
  User: Morgok
  Date: 7/28/2021
  Time: 2:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
    <title>Registration</title>
    <style>
        .error{
            color: #ff0000;
        }

        .errorblock{
            color: #000;
            background-color: indianred;
            border: 3px red;
            padding: 8px;
            margin: 16px
        }
    </style>
</head>
<body>
<h1>Registration</h1>
<form:form modelAttribute="registration">
    <form:errors path="*" cssClass="errorblock" element="div" />
    <table>
        <tr>
            <td>
                <spring:message code="name"/>
            </td>
            <td>
                <form:input path="name"/>
            </td>
            <td>
                <form:errors path="name" cssClass="error" />
            </td>
        </tr>
        <tr>
            <td>
            <td colspan="3">
                <input type="submit" value="Add Registration">
            </td>
            </td>


        </tr>
    </table>
</form:form>
</body>
</html>

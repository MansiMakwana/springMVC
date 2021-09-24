<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
        <h2>App Login Page </h2>
        <form:form id="lgoinForm" modelAttribute="login" action="validateLogin" method="post">
        <table>
                <tr>
                 <td><form:label path="loginname">Login Name</form:label></td>
                 <td><form:input path="loginname" name="loginname"/>
                 </td>
                </tr>
                <tr>
                 <td><form:label path="password">Password</form:label></td>
                 <td><form:input path="password" name="password" type="password"/>
                 </td>
                </tr>
                <tr>
                 <td></td>
                 <td><form:button id="loginbutton">Login</form:button>
                 </td>
                </tr>
        </table>
        </form:form>
</body>
</html>
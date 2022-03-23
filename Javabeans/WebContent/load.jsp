<%@page import="com.user.UserDetails"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.user.UserDetails" %>
<%@page import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%
Date today=new Date();
%>
<body>
<%
String userName=request.getParameter("t1");
String password=request.getParameter("t2");
UserDetails u1=new UserDetails();
u1.setUserName(userName);
u1.setPassword(password);
out.println(u1.getUserName());
out.println(u1.getPassword());
%>
Server date is:<%= today %>
</body>
</html>
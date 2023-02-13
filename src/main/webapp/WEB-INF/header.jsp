<%@ page language="java"
            pageEncoding="UTF-8"%>
<%@ taglib   uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>List of Users</title>
<style>
	<%@include file="/WEB-INF/cssfiles/header.css"%>
</style>
</head>

<body>
<br>
<c:if test="${!empty sessionScope.user}">
  <h1>Welcome ${user.firstname} ${user.lastname}</h1>
  <br>	  
 <ul>
  <li><a href="./">Home</a></li>
  <li><a href="./addUserForm">Add User</a></li>
  <li><a href="./usersList">List of Users</a></li>
     <li><a href="./delete">Delete User</a></li>
     <li><a href="./update">Update User</a></li>
  <li style="float:right"><a href="./logout">Logout</a></li>
</ul>
<br>
<br>
</c:if>	

<c:if test="${empty sessionScope.user}">
  <h1>Welcome to My Web Application</h1>
</c:if>

 

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib   prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List of Users</title>
<style>
	<%@include file="/WEB-INF/cssfiles/table.css"%>
	<%@include file="/WEB-INF/cssfiles/style.css"%>


</style>
</head>

<body>

 <%@include file="header.jsp"%>

 <div id="form2">
<h1>List of Users</h1><br>




<div class="table">
    
    <div class="row header blue">
      <div class="cell">
        Firstname
      </div>
      <div class="cell">
        Lastname
      </div>
      <div class="cell">
        Adress
      </div>
      <div class="cell">
        Phone
      </div>
      <div class="cell">
        Username
      </div>
      <div class="cell">
        Password
      </div>
      <div class="cell">
        Action
      </div>
    </div>
  
 <c:forEach var="i" begin="0" end="${list.size()-1}" step="1">  
  
    <div class="row">
      <div class="cell" data-title="firstname">
        <c:out value="${list[i].firstname}" />
      </div>
      <div class="cell" data-title="lastname">
        <c:out value="${list[i].lastname}" />
      </div>
      <div class="cell" data-title="adress">
        <c:out value="${list[i].adress}" />
      </div>
      <div class="cell" data-title="phone">
        <c:out value="${usersList[i].phone}" />
      </div>
      <div class="cell" data-title="user">
        <c:out value="${list[i].username}" />
      </div>
      <div class="cell" data-title="password">
        <c:out value="${list[i].password}" />
      </div>
      <div class="cell" data-title="action">
        Delete / Update
      </div>
    </div>

  </c:forEach> 
</div>
</div>
</body>
</html>
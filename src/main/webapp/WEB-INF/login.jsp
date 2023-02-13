<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="utf-8">
	<title>Login page</title>
	
    <style><%@include file="/WEB-INF/cssfiles/style.css"%></style>
</head>

<body class="wallpaper">
<%@include file="/WEB-INF/header.jsp"%>
<div id="form3">

      <form name="login" action="login"  method="post">
         <table class="form-style">

            <tr>
               <td>
                  <h3>Login</h3>
                  <label>
                     Username :<span class="required" style="color: red;">*</span>
                  </label>
               </td>
               <td>
                  <input type="text" name="username" class="long"/>

               </td>
            </tr>
            <tr>
               <td>
                  <label>
                     Password :<span class="required" style="color: red;">*</span>
                  </label>
               </td>
               <td>
                  <input type=password name="password" class="long"/>

               </td>
            </tr>

            <tr>
               <td>
                  <input type="submit" value="Login">
                  <input type="reset" value="Reset">
               </td>
            </tr>
         </table>
      </form>
   </div>
</body>
</html>
<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 12/18/2022
  Time: 10:23 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <title>Delete user</title>
    <style>
        <%@include file="/WEB-INF/cssfiles/style.css"%>
    </style>

</head>

<body>
<%@include file="header.jsp"%>
<div  id="form5">
<h1>Delete</h1>
<form name="delete" action="delete"  method="post">
    <table class="form-style">
        <tr>
            <td>
                <label>
                    Username: <span class="required" style="color: red;">*</span>
                </label>
            </td>
            <td>
                <input type="text" name="username" class="long"/>

            </td>
        </tr>
        <tr>
            <td>
                <label>
                    Password: <span class="required" style="color: red;">*</span>
                </label>
            </td>
            <td>
                <input type=text name="password" class="long"/>

            </td>
        </tr>

        <tr>
            <td>
                <input type="submit" value="Delete">
                <input type="reset" value="Reset">
            </td>
        </tr>
    </table>
</form>
</div>
</body>
</html>

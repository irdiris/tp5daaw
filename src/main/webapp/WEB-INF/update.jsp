<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>update User</title>
    <style>
        <%@include file="/WEB-INF/cssfiles/style.css"%>
    </style>
</head>

<body >

<%@include file="/WEB-INF/header.jsp"%>
<div id="form4">
<h1>Update User</h1>
<form name="updateUser" action="update"  method="post">
    <table class="form-style">
        <tr>
            <td>
                <label>
                    ID :<span class="required" style="color: red;">*</span>
                </label>
            </td>
            <td>
                <input type="text" name="ID" class="long"/>
            </td>
        </tr>

        <tr>
            <td>
                <label>
                    Firstname: <span class="required" style="color: red;">*</span>
                </label>
            </td>
            <td>
                <input type="text" name="fname" class="long"/>
            </td>
        </tr>
        <tr>
            <td>
                <label>
                    Lastname: <span class="required" style="color: red;">*</span>
                </label>
            </td>
            <td>
                <input type="text" name="lname" class="long"/>
            </td>
        </tr>
        <tr>
            <td>
                <label>
                    Adress: <span class="required" style="color: red;">*</span>
                </label>
            </td>
            <td>
                <input type="text" name="adress" class="long"/>
            </td>
        </tr>
        <tr>
            <td>
                <label>
                    Phone :<span class="required" style="color: red;">*</span>
                </label>
            </td>
            <td>
                <input type="text" name="phone" class="long"/>
            </td>
        </tr>
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
                <input type="text" name="password" class="long"/>
            </td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="update">
                <input type="reset" value="Reset">
            </td>
        </tr>
    </table>
</form>
</div>
</body>
</html>
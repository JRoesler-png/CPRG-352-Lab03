<%-- 
    Document   : agecalculator
    Created on : Oct 3, 2021, 2:31:26 PM
    Author     : Jeramie R
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        
        <h1>Age Calculator</h1>
        <form method="POST" action="age">
            <lable>Enter your age:</lable>
            <input type="text" name="age" value="${age}">
            <br>
            <input type="submit" value="Age next birthday">
            <p>${message}</p>
        </form>
        <a href="arithmetic">Arithmetic Calculator</a>
        
        
        </body>
</html>

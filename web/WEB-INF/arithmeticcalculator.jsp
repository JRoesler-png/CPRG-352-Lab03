<%-- 
    Document   : arithmeticcalculator
    Created on : Oct 3, 2021, 5:03:06 PM
    Author     : Jeramie R
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="POST" action="arithmetic">
            <lable>First:</lable>
            <input type="text" name="first" value="${first}">
            <br>
            <lable>Second:</lable>
            <input type="text" name="second" value="${second}">
            <br>
            <input type="submit" name="add" value="+">
            <input type="submit" name="substract" value="-">
            <input type="submit" name="multiply"value="*">
            <input type="submit" name="remainder"value="%">
            <br>
            <lable>Result:</lable>
            <p>${message}</p>
        </form>
        
        <a href="age">Age Calculator</a>
        
        
    </body>
</html>

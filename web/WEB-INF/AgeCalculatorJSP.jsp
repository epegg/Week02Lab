<%-- 
    Document   : AgeCalculatorJSP
    Created on : Sep 13, 2018, 12:11:00 PM
    Author     : 752814
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
        <form method="post" action="age">
            Enter Your Age: <input type="text" name="age"><br>
            <div>
                ${message}
            </div>
            <input type="submit" value="Age Next Birthday">
        </form>
            <a href="arithmetic">Arithmetic Calculation</a>
        
    </body>
</html>

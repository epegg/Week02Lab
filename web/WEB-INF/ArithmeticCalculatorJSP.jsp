<%-- 
    Document   : ArithmaticCalculatorJSP
    Created on : Sep 13, 2018, 12:45:01 PM
    Author     : 752814
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="arithmetic">
            First value: <input type="text" name="first" value="${first}" ><br>
            Second value: <input type="text" name="second" value="${second}"><br>
            <div>
                ${message} 
            </div>
            <input name="submit" type="submit" value="+"><input name="submit" type="submit" value="-"><input name="submit" type="submit" value="*"><input name="submit" type="submit" value="/">
        </form>
            <a href="/age">Age Calculation</a>
        
    </body>
</html>

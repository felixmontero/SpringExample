<%@ page isELIgnored="false" %>
<%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head><title>HELLO</title></head>
    <body>
        <h1>FORM </h1>
        <form action="/newPerson" method="post">
            Name: <input type="text" value="name" name="name">
            <br><br>
            <input type="submit" value="send">
        </form>
    </body>
</html>
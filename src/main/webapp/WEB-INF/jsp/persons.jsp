<%@ page isELIgnored="false" %>
<%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head><title>HELLO</title></head>
    <body>
       <h1>All persons</h1>
       </ul>
       <c:forEach var="p" items="${persons}">
            <li>${p.name}</li>
       </c:forEach>
       <ul>
    </body>
</html>
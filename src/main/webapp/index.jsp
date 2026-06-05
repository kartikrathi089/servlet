<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>
<head>
    <title>Square</title>
</head>
<body bgcolor='red'>

<%
    int n1 = Integer.parseInt(request.getParameter("name"));
    int sq = n1 * n1;
    out.println("Square = " + sq);
%>


</body>
</html>
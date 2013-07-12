<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Table Example</title>

</head>
<body>

<table class="table" border="1" style="width: 300px" >
    <thead>
    <tr>
        <th>Ad</th>
        <th>Soyad</th>
        <th>Yaş</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${customers}" var="item">
    <tr>
        <td>${item.name}</td>
        <td>${item.surname}</td>
        <td>${item.age}</td>
    </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
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
<c:forEach items="${publishers}" var="pub">
    <ul>
     <li>${pub.publisherName}</li>
     <li>${pub.email}</li>
        <ul>
            <c:forEach items="${pub.publishedBooks}" var="bk">
              <li>${bk.bookName}</li>
                <li>${bk.authorName}</li>
                <li>${bk.price}</li>
            </c:forEach>
        </ul>

    </ul>
</c:forEach>

</body>
</html>
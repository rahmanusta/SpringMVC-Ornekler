<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Form Example</title>
</head>
<body>

<form action="/BasicSpringMVC/postForm2" method="get">

<table>
<tr>
<td><label>Sayı1: </label></td>
<td><input type="text" value="${formbean.sayi1 }" name="sayi1"/></td>
</tr>
<tr>
<td><label>Sayı2: </label></td>
<td><input type="text" value="${formbean.sayi2 }" name="sayi2"/></td>
</tr>
</table>
<input type="submit" value="Gönder"/>
<label>Sonuç: ${formbean.sonuc}</label>
</form>
</body>
</html>
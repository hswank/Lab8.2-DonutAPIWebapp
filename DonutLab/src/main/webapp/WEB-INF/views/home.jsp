<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
<h1>Donuts</h1>
<ul>
<c:forEach items="${donuts}" var="donut">
	<li><a href="details?id=${donut.id}">${donut.name}</a></li>
</c:forEach>
</ul>
</body>
</html>
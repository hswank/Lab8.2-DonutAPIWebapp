<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Details</title>
</head>
<body>
<a href= "/">Back to List</a>
<h1>Donut</h1>

Name: ${donut.name}<br><br>
Calories: ${donut.calories}<br><br>
Extras: 
<ul>
	<c:forEach var="extra" items="${donut.extras}">
		<li>${extra}</li>
	</c:forEach>
</ul>
<img src="${donut.photo}" width=300px>
</body>
</html>
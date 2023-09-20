<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib	prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
	
	<h1>Welcome from mappings</h1>
	
	<ul>
		<li>
			<c:url value="/multi" var="multi"></c:url>
			<a href="multi">Multi</a>
		</li>
		<li>
			<c:url value="/inputs" var="inputs"></c:url>
			<a href="inputs">User inputs</a>
		</li>
		
		
	</ul>

</body>
</html>
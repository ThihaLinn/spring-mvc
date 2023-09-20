<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib	prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

		<h1>Multi Action Controller</h1>
		<p>${not empty message ? message : 'Default action'}</p>
		
		<ul>
			<li>
				<c:url var="action1" value="/multi/action1" ></c:url>
				<a href="${action1}">Action1</a>
			</li>
			<li>
				<c:url var="action11" value="/multi/action1?id=13" ></c:url>
				<a href="${action11}">Action1 with id</a>
			</li>
			<li>
				<c:url var="action2" value="/multi/action2" ></c:url>
				<a href="${action2}">Action2</a>
			</li>
			<li>
				<c:url var="wildCard" value="/multi/ggwp" ></c:url>
				<a href="${wildCard}">Wild Card</a>
			</li>
			<li>
				<c:url var="digit" value="/multi/13" ></c:url>
				<a href="${digit}">Digit</a>
			</li>
		</ul>

</body>
</html>
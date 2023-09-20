<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>User Inputs</h1>

	<c:if test="${not empty type and not empty id }">
		<table>
			<tr>
				<td>${type}</td>
				<td>${id}</td>
				<td>${date}</td>
			</tr>
		</table>
	</c:if>
	
	<c:if test="${ not empty date}">
		<h3>${ date }</h3>
	</c:if>
	
	<c:if test="${ not empty level}">
		<h3>${ level }</h3>
	</c:if>
	<c:if test="${ not empty message}">
		<h3>${ message }</h3>
	</c:if>
	<c:if test="${ not empty answer}">
		<h3>${ answer }</h3>
	</c:if>

	<ul>
		<li><c:url value="/inputs/Path-type/search/13" var="inputs"></c:url>
			<a href="${inputs}">Path variable</a></li>
		<li><c:url value="/inputs/2023-10-19" var="date"></c:url> <a
			href="${date} ">Date</a></li>
		<li><c:url value="/inputs/Advance" var="enumLink"></c:url> <a
			href="${enumLink} ">Using Enum</a></li>
		<li><c:url value="/inputs/matrix/shoe;price=30k;brand=converse" var="matrixLink"></c:url> <a
			href="${matrixLink} ">Using matrix</a></li>
		<li><c:url value="/inputs/request?p=jen&w=33&l=41" var="requestParam"></c:url> <a
		href="${requestParam}">Request Param</a></li>	
	</ul>

</body>
</html>
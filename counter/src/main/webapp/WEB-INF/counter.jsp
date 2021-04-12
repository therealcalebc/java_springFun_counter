<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title><c:out value="${title}"/></title>
	<link rel="stylesheet" type="text/css" href="css/style.css" />
</head>
<body>
	<p>You have visited <a href="/"><c:out value="${url}"/></a> <c:out value="${count}"/> times.</p>
	<p><a href="/">Test another visit?</a></p>
	<form action="/reset" method="get"><button type="submit">Reset Counter</button></form>
	<!-- <script type="text/javascript" src="js/<c:out value="${title}"/>.js"></script> -->
</body>
</html>

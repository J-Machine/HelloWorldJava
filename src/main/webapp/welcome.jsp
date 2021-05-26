<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome page</title>
<style>
	span{color: skyblue;}
</style>
</head>
<body>
	<jsp:useBean id="person" type="net.codejava.javaee.Person" scope="request" />
	<h2>Welcome dear 
		<span> <c:out value="${person.name}" default="desconocido"/> </span>
	</h2>
</body>
</html>
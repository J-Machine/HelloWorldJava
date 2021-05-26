<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome page</title>
</head>
<body>
	<jsp:useBean id="person" type="net.codejava.javaee.Person" scope="request" />
	<h2>Welcome dear 
		<span> <jsp:getProperty name="person" property="name"/>  </span>
	</h2>
</body>
</html>
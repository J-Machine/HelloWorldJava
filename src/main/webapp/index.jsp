<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
<title>First Hello World Java EE</title>
</head>
<body>
    <h1>Hello JSP and Servlet!</h1>
    <form method="post" action="helloServlet" >
	    Enter your name: <input type="text" name="yourName" size="20">
	    <input type="submit" value="Call Servlet" />
	</form>
</body>
</html>
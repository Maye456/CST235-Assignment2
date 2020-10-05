<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	Hello <%= request.getAttribute("firstname") %>
	It appears that your last name is <%= request.getAttribute("lastname")%>
	I hope you have a nice day!
</body>
</html>
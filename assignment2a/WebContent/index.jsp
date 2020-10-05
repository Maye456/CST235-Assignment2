<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="HandleFormInput" method="get">
  		<label for="fname">First name:</label><br>
  		<input type="text" id="firstname" name="firstname" value="John"><br>
  		
  		<label for="lname">Last name:</label><br>
  		<input type="text" id="lastname" name="lastname" value="Doe"><br><br>
  		
  		<input type="submit" value="Submit">
	</form> 
	
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
  <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>index</title>
</head>
<body>
	<form:form method="POST" action="/addUser" modelAttribute="userModel">
	
	<label>Username: </label>
	<input type="text" id="username" name="username"> <br>
	
	<label>Password: </label>
	<input type="text" id="password" name="password"> <br>
	
	<label>Address: </label>
	<input type="text" id="address" name="address"> <br>
	
	<input type="submit" value="Save">
	
	</form:form>
 
</body>
</html>
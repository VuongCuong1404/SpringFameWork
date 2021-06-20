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
	<h1> Add Student </h1>
	
	<form:form action="/addStudent" method="POST">
	<label>Ho Ten: </label>
	<input type="text" name="hoTen"> <br>
	
	<label>Ngay Sinh: </label>
	<input type="text" name="ngaySinh"> <br>
	
	<label>Dia Chi: </label>
	<input type="text" name="diaChi"> <br>
	
	<input type="Submit" value="Luu">
	
	</form:form>

</body>
</html>
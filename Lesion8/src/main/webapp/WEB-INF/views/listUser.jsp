<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
  
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>index</title>
</head>
<body>
  
  <!-- <h1> List USer </h1>
  <h1> ID: ${users[0].id}</h1>
  <h1> Username: ${users[0].username}</h1>
  <h1> Password: ${users[0].password}</h1>  
  <h1> Address: ${users[0].address}</h1>  -->
  
  <table border="1">
		<tr>
			<th>Id</th>
			<th>User name</th>
			<th>Password</th>
			<th>Address</th>
			
		</tr>
		
		<c:forEach var="u" items="${users}">
			<tr>
				<td>${u.id} </td>
				<td>${u.username} </td>
				<td>${u.password} </td>
				<td>${u.address} </td>
				<td> <button> <a href="/user/${u.id}">View</a>
				
				</button>
				 </td>
			<tr>
		</c:forEach>
	</table>
   
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Teacher Home Page</title>
</head>
<body bgcolor='lightyellow' text='green'>
		
		<% String emailId = (String) session.getAttribute("emailId"); %>
		
		<h3 style='color:red;'>Welcome <%= emailId %>!</h3>
		
		
		<form align='right'>
		<a href='TeacherHomePage.jsp'>Home</a> &nbsp;
		<a href='Logout'>Logout</>
		<form>
		
		
		<center>
		<h1>Welcome to TeacherHomePage</h1>
		
		<h3><a href='GetAllStuds'>GetAllStudents</a> &nbsp; &nbsp;
		<a href='GetStudById.jsp'>GetStudById</a>
		</h3> <br/>
		
		</center>
		


</body>
</html>
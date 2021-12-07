<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>
<div class="container">
	<div>
		<h1>Send an Omikuji!</h1>
	</div>
	<div>
		<form action="/process" method="post">
		<div>
			<label>Pick any number from 5 to 25</label>
			<select name="number">
			<c:forEach var="number" begin="5" end="25">
				<option value="${number }">${number}</option>
			</c:forEach>			
			</select>
		</div>
			<label class="mt-3">Enter the name of city</label>
			<input class="form-control" type="text" name="city">
			
			<label class="mt-3">Enter the name of any real person</label>
			<input class="form-control" type="text" name="person">
			
			<label class="mt-3">Enter professional endeavor or hobby</label>
			<input class="form-control" type="text" name="hobby">
			
			<label class="mt-3">Enter any type of living thing</label>
			<input class="form-control" type="text" name="thing">
			
			<label class="mt-3">Say some nice to someone</label>
			<textarea class="form-control	" name="message"></textarea>
			
			<p>Send and show a friend</p>
			<button class="btn btn-success">Share</button>
		</form>
	</div>
</div>
</body>
</html>
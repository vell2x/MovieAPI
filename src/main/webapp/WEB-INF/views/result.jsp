<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Movies</title><!-- 
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

 --></head>
<body>
	<div class="container">
<h1>Movie Results</h1>
	<table class="table">
			<thead class="thead-dark">
				<tr>
					<th>Title</th><th>Release Date</th><th>Overview</th><th>Add to Wishlist</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="m" items="${movies}">
				<tr>
				<form action="/addFavToList" method="post">
				
				<input name="title" hidden=true value="${m.title}"/>
				<input name="releaseDate" hidden=true value="${m.releaseDate}"/>
				<input name="overview" hidden=true value="${m.overview}"/>
					<td><a href="/description/{id}">${m.title}</a></td>
					<td>${m.releaseDate}</td>
					<td>${m.overview}</td>
					<td>
					 	
					      <button> Favorite</button>
					    
					</td>
					</form>
							</tr>
				</c:forEach>
			</tbody>
		</table>
		</div>
</body>
</html>
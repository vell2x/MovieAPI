<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
	<div class="container">
<h1>Movie Results</h1>
	<table class="table">
			<thead class="thead-dark">
				<tr>
					<th>Title</th><th>Release Date</th><th>Overview</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="m" items="${movies}">
				<tr>
					<td>${m.title}</a></td>
					<td>${m.releaseDate}</td>
					<td>${m.overview}</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
		</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Movies</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
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
					<td><a href="/description/{id}">${m.title}</a></td>
					<td>${m.releaseDate}</td>
					<td>${m.overview}</td>
					<td><form>
  <fieldset>
    <span class="star-cb-group">
      <input type="radio" id="rating-1" name="rating" value="1" /><label for="rating-1"></label>
    </span>
  </fieldset>
</form></td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
		</div>
</body>
</html>
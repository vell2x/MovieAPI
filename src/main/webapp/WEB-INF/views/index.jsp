<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
	<p>
	<form action="/movie" >
	<label>Search by Keyword</label>
	<input name="keyword"/>
	<button>Submit</button>
	</form>
	</p>
	<p>
	<form action="/movie" >
	<label>Search by Movie Title</label>
	<input name="keyword"/>
	<button>Submit</button>
	</form>
	</p>
	<p>
	<form action="/movie" >
	<label>Search by Release Date</label>
	<input name="release"/>
	<button>Submit</button>
	</form>
	</p>
</body>
</html>
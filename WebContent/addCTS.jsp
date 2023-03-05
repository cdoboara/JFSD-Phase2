<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Subject to Class</title>
</head>
<body>
<h2> Add new subject to class</h2>
<form action="CTSController" method="post">
<label>Class Id</label>
<input type="text" name="cid"><br/>
<label>Subject Id</label>
<input type="text" name="sid"><br/>
<label>Teacher Id</label>
<input type="text" name="tid"><br/>
<input type="submit" value="Add Subject">
<input type="reset" value="Reset">
<a href="http://localhost:9292/Academy/index.jsp">Index</a>
</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Subject to Class</title>
</head>
<body>
<h2> Display class details</h2>
<form action="CTSController" method="get">
<label>Class Id</label>
<input type="text" name="cid"><br/>
<input type="submit" value="Search by class Id">
<input type="reset" value="Reset">
<a href="http://localhost:9292/Academy/index.jsp">Index</a>
</form>
</body>
</html>
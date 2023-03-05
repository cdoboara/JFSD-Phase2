<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>AddSubject</title>
</head>
<body>
<h2> Add a new Subject</h2>
<form action="SubjectController" method="post">
<label>Subject Id</label>
<input type="text" name="sid"><br/>
<label>Subject Name</label>
<input type="text" name="sname"><br/>
<input type="submit" value="Add Subject">
<input type="reset" value="Reset">
<a href="http://localhost:9292/Academy/index.jsp">Index</a>
</form>
</body>
</html>
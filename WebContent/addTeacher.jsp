<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>AddTeacher</title>
</head>
<body>
<h2> Add a new Teacher</h2>
<form action="TeacherController" method="post">
<label>Teacher Id</label>
<input type="text" name="tid"><br/>
<label>Teacher Name</label>
<input type="text" name="tname"><br/>
<input type="submit" value="Add Teacher">
<input type="reset" value="Reset">
<a href="http://localhost:9292/Academy/index.jsp">Index</a>
</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2> Add a new Student</h2>
<form action="StudentController" method="post">
<label>StudentId</label>
<input type="text" name="sid"><br/>
<label>StudentName</label>
<input type="text" name="sname"><br/>
<label>ClssId</label>
<input type="text" name="cid"><br/>
<input type="submit" value="Add Student">
<input type="reset" value="Reset">
<a href="http://localhost:9292/Academy/index.jsp">Index</a>
</form>
</body>
</html>
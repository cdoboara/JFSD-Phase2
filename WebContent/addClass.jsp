<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2> Add a new Class</h2>
<form action="ClassController" method="post">
<label>ClassId</label>
<input type="text" name="cid"><br/>
<label>ClassName</label>
<input type="text" name="cname"><br/>
<input type="submit" value="Add Class">
<input type="reset" value="Reset">
<a href="http://localhost:9292/Academy/index.jsp">Index</a>
</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Danh Sách Bài Học</h1>
	<ul>
		<li><a href="<%=request.getContextPath()%>/Search?id=1">Học JaVa</a></li>
		<li><a href="<%=request.getContextPath()%>/Search?id=2">Học php</a></li>
		<li><a href="<%=request.getContextPath()%>/Search?id=3">Học android</a></li>
		<li><a href="<%=request.getContextPath()%>/Search?id=4">Học ruby</a></li>
		<li><a href="<%=request.getContextPath()%>/Search?id=5">Học ios</a></li>
	</ul>
</body>
</html>
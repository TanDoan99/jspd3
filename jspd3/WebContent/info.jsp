<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Thông tin người dùng</title>
</head>
<body>
	<%
		if (request.getAttribute("hoten") != null && request.getAttribute("tuoi") != null) {
			String hoten=(String) request.getAttribute("hoten");
			int tuoi=(int)request.getAttribute("tuoi");
	%>
	<h2>Thông Tin Người Dùng</h2>
	<p>
		Học Tên:
		<%=hoten%>
	</p>
	<p>
		Tuổi:
		<%=tuoi%></p>
	
	<%
		} else {
	%>
	<p style="color: green">Không có thông tin người dùng</p>

	<%
		}
	%>
</body>
</html>
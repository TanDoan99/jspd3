<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="bean.Hoa"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>In Ra Danh Sách Hoa</title>
</head>
<body>
	<div style="background-color: #58D3F7; width: 500px; margin: 50px auto;border-radius: 10px;border: 3px solid;">
	<%
		if(session.getAttribute("listHoa")!=null){
			ArrayList<Hoa> listHoa=(ArrayList<Hoa>) session.getAttribute("listHoa");
		
	%>
		<h1 style="color: #FF0040;background-color: #9FF781;padding-left: 100px;">In Ra Danh Sách Hoa</h1>
		<table border="2" width="500px" style="background-color: #F2F5A9; margin:auto;padding: 10px;">
			<tr>
				<th>ID Hoa</th>
				<th>Tên Hoa</th>
				<th>Số Lượng</th>
				<th>Giá Bán</th>
				<th>Thành tiền</th>
			</tr>
			<%
				float tongTien=0;
				for(Hoa objHoa: listHoa){
					tongTien+=objHoa.getSoLuong()*objHoa.getGiaBan();
			%>
			<tr>
				<td><%=objHoa.getIdHoa() %></td>
				<td><%=objHoa.getTenHoa() %></td>
				<td><%=objHoa.getSoLuong() %></td>
				<td><%=objHoa.getGiaBan() %></td>
				<td><%=objHoa.getGiaBan()*objHoa.getSoLuong() %></td>
			</tr>
			<%} %>
			<tr>
				<td colspan="4">Tổng tiền: </td>
				<td><%=tongTien %></td>
			</tr>
		</table>
		<%}else{ %>
		<p>Không có danh sách hoa</p>
		<%} %>
	</div>
</body>
</html>
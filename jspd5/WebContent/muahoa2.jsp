<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Mua Hoa</title>
</head>
<body>
	<div style="background-color: #58D3F7; width: 500px; height:400px; margin: 50px auto;border-radius: 10px;border: 3px solid;">
		<%
		if(request.getParameter("msg")!=null){
			int msg = Integer.parseInt(request.getParameter("msg"));
			if(msg==1){
				out.print("<p style='color:red'>Mua hoa thành công</p>");
			}
			
		}
		%>
		
		<h1 style="color: #FF0040;background-color: #9FF781;padding-left: 130px;">Form mua hoa</h1>
		<form action="<%=request.getContextPath()%>/xu-ly-muahoa-baitap2"method="post" style="margin-left: 25px;padding-bottom: 10px;">
			<label>ID Hoa : </label>
			<input type="text" value=""name="idhoa"style="margin-left: 56px;"/> <br/><br/>
			<label>Tên Hoa : </label>
			<input type="text" value=""name="tenhoa"style="margin-left: 50px;"/> <br/><br/>
			<label>Số lượng : </label>
			<input type="text" value=""name="soluong"style="margin-left: 48px;"/> <br/><br/>
			<label>Giá bán : </label>
			<input type="text" value=""name="giaban"style="margin-left: 54px;"/> <br/><br/>
			
			
			<input type="submit" value="Mua" name="submit"style="margin-left: 120px;width: 70px;background-color: #9FF781;" />
		</form>
		<a href="<%=request.getContextPath() %>/xu-ly-muahoa-baitap2?load=0"title=""style="margin-left:20px ;">In ra danh sách các đối tượng hoa</a><br/><br/>
		<a href="<%=request.getContextPath() %>/xu-ly-muahoa-baitap2?load=1"title=""style="margin-left:20px ;">In ra danh sách hoa có số lượng > 10</a><br/><br/>
		<a href="<%=request.getContextPath() %>/xu-ly-muahoa-baitap2?load=2"title=""style="margin-left:20px ;">In ra danh sách hoa có giá bán <10000</a>
	</div>
</body>
</html>
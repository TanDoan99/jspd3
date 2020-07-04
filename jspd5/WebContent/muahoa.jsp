<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Mua Hoa</title>
</head>
<body>
	<div style="background-color: #58D3F7; width: 500px; margin: 50px auto;border-radius: 10px;border: 3px solid;">
		<h1 style="color: #FF0040;background-color: #9FF781;padding-left: 130px;">Form mua hoa</h1>
		<form action="<%=request.getContextPath()%>/xuly-muahoa"method="post" style="margin-left: 25px;padding-bottom: 10px;">
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
	</div>
</body>
</html>
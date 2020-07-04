package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/RegisterUserController")
public class RegisterUserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public RegisterUserController() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		doPost(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//doGet(request, response);
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		try {
			String Name= request.getParameter("name");
			String Pass=request.getParameter("pass");
			String Repass=request.getParameter("repass");
			String Address=request.getParameter("address");
			
			request.setAttribute("Name", Name);
			if (Name.isEmpty()==true) {
				throw new Exception("Lỗi vui lòng nhập name ");
			}
			request.setAttribute("Pass", Pass);
			if (Pass.isEmpty()==true) {
				throw new Exception( "Lỗi vui lòng nhập password ");
			}
			if ("".equals(Pass) ||!Pass.startsWith("VNE")) {
				throw new Exception("Mật khẩu phải bắt đầu ký chuỗi VNE ") ;
			}
			request.setAttribute("Repass", Repass);
			if (Repass.isEmpty()==true) {
				throw new Exception("Lỗi vui lòng nhập lại password ");
			}
			if (!Repass.equals(Pass)) {
				throw new Exception("Vui lòng nhập repass phải trùng khớp với pass");
			}
			request.setAttribute("Address", Address);
			if (Address.isEmpty()==true) {
				throw new Exception("Lỗi vui lòng nhập địa chỉ ") ;
			}
			RequestDispatcher rq1=request.getRequestDispatcher("/index.jsp");
			rq1.forward(request, response);
		} catch (Exception e) {
			request.setAttribute("mess", e.getMessage());
		}
		
		RequestDispatcher rq=request.getRequestDispatcher("/register.jsp");
		rq.forward(request, response);
		
	}

}

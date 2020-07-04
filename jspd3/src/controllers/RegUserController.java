package controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/reg-user")
public class RegUserController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RegUserController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// response.getWriter().append("Served at: ").append(request.getContextPath());
//		response.setContentType("text/html");
//		response.setCharacterEncoding("UTF-8");
//		request.setCharacterEncoding("UTF-8");
//		PrintWriter out=response.getWriter();
//		
//		String hoten=request.getParameter("hoten");
//		int tuoi=Integer.parseInt(request.getParameter("tuoi"));
//		String chieucao=request.getParameter("chieucao");
		/*
		 * out.print("<p> doGet: Thông tin người dùng </p>"); out.print("Họ Tên: "+hoten
		 * +"<br/>"); out.print("Tuổi : "+tuoi +"<br/>");
		 * out.print("Chiều Cao : "+chieucao +"<br/>");
		 */

		// doGet: tốc độ xử lí nhanh hơn
		// truyền các biến qua URL
		// độ dài chuỗi sấp sỉ 2k3 từ
		// áp dụng trang tìm kiếm
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// doGet(request, response);
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();

		String hoten = request.getParameter("hoten");
		int tuoi = Integer.parseInt(request.getParameter("tuoi"));
		String chieucao = request.getParameter("chieucao");
		request.setAttribute("hoten", hoten);
		request.setAttribute("tuoi", tuoi);

		RequestDispatcher rd = request.getRequestDispatcher("/info.jsp");
		rd.forward(request, response);// truyền sang file info
/*
 * Phân biệt redirect / forward:
 * 1.
 * Resdirect: chuyển hướng bất kì đường dẫn nào
 * Forward: chỉ chuyển hướng các file or đường dẫn
 * 2.
 * 
 * 
 * Dùng Forward
 * */
//		response.setContentType("text/html");
//		response.setCharacterEncoding("UTF-8");
//		request.setCharacterEncoding("UTF-8");
//		PrintWriter out=response.getWriter();
//		
//		String hoten=request.getParameter("hoten");
//		int tuoi=Integer.parseInt(request.getParameter("tuoi"));
//		String chieucao=request.getParameter("chieucao");
//		out.print("<p> doPost: Thông tin người dùng </p>");
//		out.print("Họ Tên: "+hoten +"<br/>");
//		out.print("Tuổi : "+tuoi +"<br/>");
//		out.print("Chiều Cao : "+chieucao +"<br/>");
		// Post: đường dẫn bị ẩn
		// áp dụng đa số dùng Post
		// áp dụng trường hợp bảo mật
	}

}

package controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Search")
public class searchController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public searchController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		PrintWriter out=response.getWriter();
		
		int id=Integer.parseInt(request.getParameter("id"));
		switch (id) {
		case 1:
			response.sendRedirect("https://www.google.com/search?q=H%E1%BB%8Dc+JaVa&oq=H%E1%BB%8Dc+JaVa&aqs=chrome..69i57j0l3j69i60l3j69i65.53014j0j4&sourceid=chrome&ie=UTF-8");
			break;
		case 2:
			response.sendRedirect("https://www.google.com/search?q=H%E1%BB%8Dc+php&oq=H%E1%BB%8Dc+php&aqs=chrome..69i57j0l4j69i60l3.726j0j4&sourceid=chrome&ie=UTF-8");
			break;
		case 3:
			response.sendRedirect("https://www.google.com/search?q=H%E1%BB%8Dc+android&oq=H%E1%BB%8Dc+android&aqs=chrome..69i57j0l7.1387j0j9&sourceid=chrome&ie=UTF-8");
			break;
		case 4:
			response.sendRedirect("https://www.google.com/search?q=H%E1%BB%8Dc+ruby&oq=H%E1%BB%8Dc+ruby&aqs=chrome..69i57j0l7.717j0j7&sourceid=chrome&ie=UTF-8");
			break;
		case 5:
			response.sendRedirect("https://www.google.com/search?q=H%E1%BB%8Dc+ios&oq=H%E1%BB%8Dc+ios&aqs=chrome..69i57j0l7.2102j0j9&sourceid=chrome&ie=UTF-8");
			break;
		default:
			response.sendRedirect("https://www.google.com/");
			break;
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//doGet(request, response);
	}

}

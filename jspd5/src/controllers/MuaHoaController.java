package controllers;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.Hoa;
@WebServlet("/MuaHoaController")
public class MuaHoaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private ArrayList<Hoa> listHoa=new ArrayList<Hoa>();
	public MuaHoaController() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//doGet(request, response);
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		HttpSession session=request.getSession();
		boolean check=true;
		int idHoa=Integer.parseInt(request.getParameter("idhoa"));
		String tenHoa=request.getParameter("tenhoa");
		int soLuong=Integer.parseInt(request.getParameter("soluong"));
		float giaBan =Float.parseFloat(request.getParameter("giaban"));
		Hoa objHoa= new Hoa(idHoa, tenHoa, soLuong, giaBan);
		if (listHoa.size()>0) {
			for (Hoa hoa : listHoa) {
				if (hoa.getIdHoa()== idHoa) {
					hoa.setSoLuong(soLuong+ hoa.getSoLuong());
					check=true;
				}else {
					check=false;
				}
			}
		}
		if (check==false|| listHoa.size()==0) {
			listHoa.add(objHoa);		
			}
		session.setAttribute("listHoa", listHoa);
		response.sendRedirect(request.getContextPath()+"/basket.jsp");
	}

}

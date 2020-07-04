package controllers;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Hoa;

/**
 * Servlet implementation class MuaHoaBaiTap2Controller
 */
@WebServlet("/MuaHoaBaiTap2Controller")
public class MuaHoaBaiTap2Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ArrayList<Hoa> listHoa = new ArrayList<Hoa>();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MuaHoaBaiTap2Controller() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ArrayList<Hoa> listHoaLoad = new ArrayList<>();
		if (request.getParameter("load") != null) {
			int chonHienThi = Integer.parseInt(request.getParameter("load"));
			if (chonHienThi == 0) {
				listHoaLoad = listHoa;
			} else if (chonHienThi == 1) {
				for (Hoa hoa : listHoa) {
					if (hoa.getSoLuong() > 10) {
						listHoaLoad.add(hoa);
					}
				}
			} else {
				for (Hoa hoa : listHoa) {
					if (hoa.getGiaBan() < 10000) {

					}
				}
			}

		}
		
		request.setAttribute("listHoaLoad", listHoaLoad);
		RequestDispatcher rd =request.getRequestDispatcher("/basket2.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		int idHoa = Integer.parseInt(request.getParameter("idhoa"));
		String tenHoa = request.getParameter("tenhoa");
		int soLuong = Integer.parseInt(request.getParameter("soluong"));
		float giaBan = Float.parseFloat(request.getParameter("giaban"));
		boolean check = true;
		Hoa objHoa = new Hoa(idHoa, tenHoa, soLuong, giaBan);
		if (listHoa.size() > 0) {
			for (Hoa hoa : listHoa) {
				if (hoa.getIdHoa() == idHoa) {
					hoa.setSoLuong(soLuong + hoa.getSoLuong());
					check = true;
				} else {
					check = false;
				}
			}
		}
		if (check == false || listHoa.size() == 0) {
			listHoa.add(objHoa);
		}
		
		response.sendRedirect(request.getContextPath() + "/muahoa-baitap2?msg=1");
	}

}

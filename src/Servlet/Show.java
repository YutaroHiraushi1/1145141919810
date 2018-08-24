package Servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Dao.kadaidao;
import Dto.kadaidto;

/**
 * Servlet implementation class Show
 */
@WebServlet("/Show")
public class Show extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Show() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession();
		String view = null;
		try {
		String id = request.getParameter("num");
		int num = Integer.parseInt(id);
		String pass = request.getParameter("pass");

		kadaidao.login(num,pass);
		ArrayList<kadaidto> result = kadaidao.search(num);
		session.setAttribute("num", num);
		request.setAttribute("search", result);

		view = "/WEB-INF/view/show.jsp";

		}catch(Exception e){
			int num = (int)session.getAttribute("num");
			ArrayList<kadaidto> result = kadaidao.search(num);
			session.setAttribute("num", num);
			request.setAttribute("search", result);
			view = "/WEB-INF/view/show.jsp";
		}finally {
			RequestDispatcher dispatcher = request.getRequestDispatcher(view);
			dispatcher.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
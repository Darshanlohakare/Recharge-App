package rec.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import rec.dao.RechargeDao;
import rec.dao.RechargeDaoImpl;
import rec.model.User;


/**
 * Servlet implementation class UserLoginController
 */
@WebServlet("/UserLoginController")
public class UserLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UserLoginController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email=request.getParameter("email");
		String password=request.getParameter("password");

		RechargeDao Udao=new RechargeDaoImpl();
		List<User> lst=Udao.Login(email, password);
		PrintWriter pw=response.getWriter();
		if (!lst.isEmpty()) {
			pw.println("LOGIN SUCCESSFULLY.....");
		} else {
			pw.println("LOGIN FAILED.....");
		}
		response.sendRedirect("UserDashBoard.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

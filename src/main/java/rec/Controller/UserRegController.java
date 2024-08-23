package rec.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
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
 * Servlet implementation class UserRegController
 */
@WebServlet("/UserRegController")
public class UserRegController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserRegController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String custName=request.getParameter("custName");
		String mobNo=request.getParameter("mobNo");
		String email=request.getParameter("email");
		String password=request.getParameter("password");

		User Uobj= new User(custName, mobNo, email, password);
		List<User> lst=new ArrayList<User>();
		lst.add(Uobj);

		PrintWriter pw=response.getWriter();
		RechargeDao Udao=new RechargeDaoImpl();
		int i=Udao.Register(lst);
		if(i>0)
		{
			pw.println("Record Inserted....");
		}
		response.sendRedirect("UserLogin.jsp");

	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

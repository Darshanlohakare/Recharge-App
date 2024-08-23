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
import rec.model.Admin;

/**
 * Servlet implementation class AdminRegController
 */
@WebServlet("/AdminRegController")
public class AdminRegController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminRegController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String adName=request.getParameter("adName");
		String email=request.getParameter("email");
		String password=request.getParameter("password");

		Admin aobj= new Admin(adName, email, password);
		List<Admin> alst=new ArrayList<Admin>();
		alst.add(aobj);

		PrintWriter pw=response.getWriter();
		RechargeDao rdao=new RechargeDaoImpl();
		int i=rdao.AdRegister(alst);
		if(i>0)
		{
			pw.println("Record Inserted....");
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

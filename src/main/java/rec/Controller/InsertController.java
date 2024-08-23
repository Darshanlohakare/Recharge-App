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
import rec.model.Recharge;

/**
 * Servlet implementation class InsertController
 */
@WebServlet("/InsertController")
public class InsertController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String planId=request.getParameter("planId");
		String provider=request.getParameter("provider");
		String planName=request.getParameter("planName");
		String planDetails=request.getParameter("planDetails");
		String planPrice=request.getParameter("planPrice");

		Recharge robj= new Recharge(planId, provider, planName, planDetails, planPrice);
		List<Recharge> lst=new ArrayList<Recharge>();
		lst.add(robj);

		PrintWriter pw=response.getWriter();
		RechargeDao rdao=new RechargeDaoImpl();
		int i=rdao.Insert(lst);
		if(i>0)
		{
			pw.println("Rechagre Inserted....");
		}
		else
		{
			pw.println("Rechagre Not Inserted....");
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

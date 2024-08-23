package rec.Controller;

import java.io.IOException;
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
 * Servlet implementation class UpdateController
 */
@WebServlet("/UpdateController")
public class UpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String planId=request.getParameter("planId");
        String planPrice=request.getParameter("planPrice");

        RechargeDao rdao=new RechargeDaoImpl();
        List<Recharge> lst=rdao.Update(planId, planPrice);
        if (lst.size() > 0) {
            Recharge r=lst.get(0);
            System.out.println(r.planId+"\t"+r.planName+"\t"+r.planPrice+"\t");
            response.getWriter().println("Update Successful");
        } else {
            response.getWriter().println("Update Failed");
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

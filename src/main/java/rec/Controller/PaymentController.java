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
import rec.model.Payment;
import rec.model.Recharge;

/**
 * Servlet implementation class PaymentController
 */
@WebServlet("/PaymentController")
public class PaymentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PaymentController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cardno=request.getParameter("cardno");
		String cardname=request.getParameter("cardname");
		String expdate=request.getParameter("expdate");
		String cvv=request.getParameter("cvv");
		

		Payment robj= new Payment(cardno, cardname, expdate, cvv) ;
		List<Payment> lst=new ArrayList<Payment>();
		lst.add(robj);

		PrintWriter pw=response.getWriter();
		RechargeDao rdao=new RechargeDaoImpl();
		int i=rdao.Payment(lst);
		if(i>0)
		{
			pw.println("Payment Done Successfully....");
		}
		else
		{
			pw.println("Payment Not Inserted....");
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

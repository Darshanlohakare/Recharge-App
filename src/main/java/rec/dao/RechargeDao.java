package rec.dao;

import java.util.List;

import rec.model.Payment;
import rec.model.Admin;
import rec.model.Recharge;
import rec.model.User;

public interface RechargeDao {
	
		//User
		public int Register(List<User> lst);
		public List<User> Login(String email,String password);
		
		//Admin
		public int AdRegister(List<Admin> alst);
		public List<Admin> AdLogin(String email,String password);
		
		//Administration Plan Details
		public int Insert(List<Recharge> lst);
		public List<Recharge> Update(String planId,String planPrice);
		public List<Recharge> Delete (String planId);
		public List<User> Display();	
		
		//User Plan Details
		public List<Recharge> Recharge();
		
		//Payment
		public int Payment(List<Payment> lst);
		public List<Payment> Displayall();	
		
}

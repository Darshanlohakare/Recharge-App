package rec.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import rec.db.DbConnection;

import rec.model.Admin;
import rec.model.Recharge;
import rec.model.User;
import rec.model.Payment;

public class RechargeDaoImpl implements RechargeDao {

	
	Connection con=null;
	public int Register(List<User> lst) {
		// TODO Auto-generated method stub
		int i=0;
		con=DbConnection.getDbConnection();
		try {
			for(User U:lst) {
				PreparedStatement pstate=con.prepareStatement("insert into User1 values(?,?,?,?)");
				pstate.setString(1,U.getCustName());
				pstate.setString(2,U.getMobNo());
				pstate.setString(3,U.getEmail());
				pstate.setString(4,U.getPassword());

				i=pstate.executeUpdate();
				if(i>0)
				{

					System.out.println("Record save...");
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		return i;
	}
	@Override
	public List<User> Login(String email, String password) {
	    List<User> lst = new ArrayList<User>();
	    Connection con = DbConnection.getDbConnection();
	    ResultSet rs = null;

	    try {
	        PreparedStatement pstate = con.prepareStatement("select * from User1 where email=? AND password=?");
	        pstate.setString(1,email);
	        pstate.setString(2,password);
	        rs = pstate.executeQuery();

	        while (rs.next()) {
	            User dobj = new User(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));
	            lst.add(dobj);
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    } finally {
	        try {
	            con.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    return lst;
	}
	@Override
	public int AdRegister(List<Admin> alst) {
		
			int i=0;
			con=DbConnection.getDbConnection();
			try {
				for(Admin a:alst) {
					PreparedStatement pstate=con.prepareStatement("insert into admin values(?,?,?)");
					pstate.setString(1,a.getAdName());
					pstate.setString(2,a.getEmail());
					pstate.setString(3,a.getPassword());

					i=pstate.executeUpdate();
					if(i>0)
					{

						System.out.println("Record save...");
					}
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally
			{
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
			return i;
		}
	@Override
	public List<Admin> AdLogin(String email, String password) {
		List<Admin> alst = new ArrayList<Admin>();
		Connection con = DbConnection.getDbConnection();
		ResultSet rs = null;

		try {
			PreparedStatement pstate = con.prepareStatement("select * from admin where email=? AND password=?");
			pstate.setString(1,email);
			pstate.setString(2,password);
			rs = pstate.executeQuery();

			while (rs.next()) {
				Admin aobj = new Admin(rs.getString(1),rs.getString(2),rs.getString(3));
				alst.add(aobj);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally
		{
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return alst;
	}
	@Override
	public int Insert(List<Recharge> lst) {
		int i=0;
		Connection con=DbConnection.getDbConnection();
		try {
			for(Recharge r:lst) {
				PreparedStatement pstate=con.prepareStatement("insert into recharge values(?,?,?,?,?)");
				pstate.setString(1,r.planId);
				pstate.setString(2,r.provider);
				pstate.setString(3,r.planName);
				pstate.setString(4,r.planDetails);
				pstate.setString(5,r.planPrice);

				i=pstate.executeUpdate();
				if(i>0)
				{
					System.out.println("Record save...");
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally 
		{
			try 
			{
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return i;
		}
	@Override
	public List<Recharge> Update(String planId, String planPrice) {
		 List<Recharge> lst = new ArrayList<Recharge>();
	        Connection con = DbConnection.getDbConnection();
	        try {
	            PreparedStatement pstate = con.prepareStatement("update recharge set planPrice=? where planId=?");
	            pstate.setString(1,planPrice);
	            pstate.setString(2,planId);

	            int j = pstate.executeUpdate();
	            if (j > 0) {
	                Recharge robj = new Recharge(planId, planPrice, planId, planId, planPrice);
	                lst.add(robj);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                con.close();
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }
	        return lst;    
	    }

	@Override
	public List<Recharge> Delete(String planId) {
		int i=0;
		List<Recharge> lst = new ArrayList<Recharge>();
		Connection con=DbConnection.getDbConnection();
		try {
			PreparedStatement pstate=con.prepareStatement("delete from recharge where planId=?");
			pstate.setString(1, planId);
			i=pstate.executeUpdate();
			if(i>0)
			{
				System.out.println("Record Deleted..");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lst;

	}
	@Override
	public List<User> Display() {
		Connection con = DbConnection.getDbConnection();
		List<User> lst = new LinkedList<User>();
		String str = "select * from User1";
		ResultSet rs =null;
		try {
			Statement stat = con.createStatement();
			rs = stat.executeQuery(str);

			ResultSetMetaData rsmd = rs.getMetaData();
			for (int i = 1; i <= rsmd.getColumnCount(); i++) {
				System.out.print(rsmd.getColumnName(i) + "\t");
			}
			System.out.println("\n=================================================================");

			while (rs.next()) {

				lst.add(new User(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)));
			}
		}catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return lst;
	}
	@Override
	public List<Recharge> Recharge() {
		Connection con = DbConnection.getDbConnection();
		List<Recharge> lst = new LinkedList<Recharge>();
		String str = "select * from recharge";
		ResultSet rs =null;
		try {
			Statement stat = con.createStatement();
			rs = stat.executeQuery(str);

			ResultSetMetaData rsmd = rs.getMetaData();
			for (int i = 1; i <= rsmd.getColumnCount(); i++) {
				System.out.print(rsmd.getColumnName(i) + "\t");
			}
			System.out.println("\n=================================================================");

			while (rs.next()) {

				lst.add(new Recharge(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)));
			}
		}catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return lst;

	}
	@Override
	public int Payment(List<Payment> lst) {
		int i=0;
		con=DbConnection.getDbConnection();
		try {
			for(Payment p:lst) {
				PreparedStatement pstate=con.prepareStatement("insert into payment values(?,?,?,?)");
				pstate.setString(1,p.getCardno());
				pstate.setString(2,p.getCardname());
				pstate.setString(3,p.getExpdate());
				pstate.setString(4,p.getCvv());

				i=pstate.executeUpdate();
				if(i>0)
				{

					System.out.println("Record save...");
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		return i;
	}
	@Override
	public List<Payment> Displayall() {
		Connection con = DbConnection.getDbConnection();
		List<Payment> lst = new LinkedList<Payment>();
		String str = "select * from payment";
		ResultSet rs =null;
		try {
			Statement stat = con.createStatement();
			rs = stat.executeQuery(str);

			ResultSetMetaData rsmd = rs.getMetaData();
			for (int i = 1; i <= rsmd.getColumnCount(); i++) {
				System.out.print(rsmd.getColumnName(i) + "\t");
			}
			System.out.println("\n=================================================================");

			while (rs.next()) {

				lst.add(new Payment(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)));
			}
		}catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return lst;
	}
	
	
}

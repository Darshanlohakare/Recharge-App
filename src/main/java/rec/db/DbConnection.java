package rec.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

	public static Connection getDbConnection()
	{

		String driver="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:XE";
		String Username="system";
		String Password="123456789";
		
		Connection con=null;

		try {
		    Class.forName(driver);
			con =DriverManager.getConnection(url,Username,Password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Connection to DataBase"+con);
		return con;

	}

}

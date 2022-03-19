import java.sql.Connection;


import java.sql.SQLException;

import com.mysql.cj.jdbc.MysqlDataSource;

public class connect {
	
	private static String servername="localhost";
	private static String username="root";
	private static String dbname="login_info";
	private static Integer portnumber = 3306;
	private static String password="";
	
  
	public static Connection getConnection()
	{
		 Connection cnx = null;
		 MysqlDataSource datasource = new MysqlDataSource();
		  
		 datasource.setServerName(servername);
		 datasource.setUser(username);
		 datasource.setPassword(password);
		 datasource.setDatabaseName(dbname);
		 datasource.setPortNumber(portnumber);
		 
		 try {
			cnx = datasource.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cnx;
		 
		
	}
}

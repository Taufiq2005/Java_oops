package library;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
	
	static String url = "jdbc:mysql://localhost:3306/librarydb";
	static String user = "root";
	static String pass = "Mysql@123";
	
	public static Connection getConnection() {
		
		try {
			
			return DriverManager.getConnection(url,user,pass); 
				
		}
		
		catch (Exception e) {
			
			System.out.println(e);
			
		}
		
		      return null;
	}

}

package library;

import java.sql.*;

public class DatabaseConnection {
	
	static String url = "jdbc:mysql://localhost:3306/atmdb";
	static String user = "root";
	static String pass = "Mysql@123";
	
	public static Connection getConnection() throws Exception{
		return DriverManager.getConnection(url,user,pass);
		
	}
	
}

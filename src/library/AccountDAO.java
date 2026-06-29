package library;

import java.sql.*;

public class AccountDAO {
	
	public void showBalance(int accNo) {
		
		try {
			
			Connection con =DatabaseConnection.getConnection();
			
	       PreparedStatement ps = con.prepareStatement("select balance from account where acc_no=?");
	       
	       ps.setInt(1,accNo);
	       
	       ResultSet rs = ps.executeQuery();
	       
	       if(rs.next()) {
	    	   
	    	   System.out.println("Balance = "+ rs.getDouble("Balance"));
	       }
	       
		} catch(Exception e) {
			
			System.out.println(e);
			
		}
		
	}

	
}
	

	



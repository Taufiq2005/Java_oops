package library;

import java.sql.*;
import java.util.*;

public class LibraryDAO {
	
	public void addbook(Book b) {
			
       try {
    	   
    	   Connection con = DBUtil.getConnection();
    	   
    	   String sql = "insert into books values(?,?,?)";
    	   
    	   PreparedStatement ps = con.prepareStatement(sql);
    	   
    	   ps.setInt(1, b.getId());
    	   ps.setString(2, b.getName());
    	   ps.setString(3, b.getAuthor());
    	   
    	   ps.executeUpdate();
    	   
    	  System.out.println("Book Added");
    	     
       } catch (Exception e) {
    	   
    	   System.out.println(e);
    	   
       }
       
	}  
	
	public void viewBooks() {
		
		try {
			
			Connection con = DBUtil.getConnection();
			
		    Statement st = con.createStatement();
		    
		    ResultSet rs = st.executeQuery("select * from books");
		    
		    while (rs.next()) {
		    	
		    	System.out.println(
		    			rs.getInt(1)+""+
		    	        rs.getString(2)+""+
		    		    rs.getString(3));
		    		
		    	}
		    
		} catch (Exception e) {
			
			System.out.println(e);
		        	
		    }
		
		}
	
	}
       
	
	



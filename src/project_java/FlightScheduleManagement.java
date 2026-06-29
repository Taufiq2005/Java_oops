package project_java;

import java.util.Scanner;

 @SuppressWarnings("unused")
 class FlightMan {
	 
	 String code,location,scheduletype,time;
	 boolean active;
	 
	 
	FlightMan(String code, String location, String scheduletype, String time, boolean active ) {
		
		this.code = code;
		this.location = location;
		this.scheduletype = scheduletype;
		this.time = time;
		this.active = active;
		
	}

		   void display() {
	    	   
	    	   if(active) {
	    		   
	    		   System.out.println("Flight :"+code);
	    		   System.out.println("Location :"+location);
	    		   System.out.println("Scheduletype :"+scheduletype);
	    		   System.out.println("Time :"+time);
	    		   System.out.println("Status :"+active);
	    		   System.out.println();
	    		   
	    	   }
	    	   
	       }
	       
        }
 
 
           public class FlightScheduleManagement{
        	   
        	      public static void main(String[] args) {
					
        	    	  FlightMan f1 = new FlightMan("AI101","Chennai to Mumbai","Weekly","10:00A.M",true);
        	    	  
        	    	  FlightMan f2 = new FlightMan("AI102","Delhi to Ahmedabad","Monthly","12:00P.M",true);
        	    	  
        	    	  FlightMan f3 = new FlightMan("SE103","Mumbai to Singapore","Yearly","6:30P.M",true);
        	    	  
        	    	  f1.display();
        	    	  System.out.println();
        	    	  
        	    	  f2.display();
        	    	  System.out.println();
        	    	  
        	    	  f3.display();
        	    	  System.out.println();
        	    	  
        	    	  	  
        	    	 }
        	      
        	      
				}
           

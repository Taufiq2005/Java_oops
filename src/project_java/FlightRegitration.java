package project_java;

import java.util.Scanner;

class Flight {
	
	private String flightCode;
	private String flightName;
	private String flightMake;
	private int flightCapacity;
	private boolean active;
	
public Flight(String flightCode, String flightName, String flightMake, int flightCapacity, boolean active)	{
	
	this.flightCode = flightCode;
	this.flightName = flightName;
	this.flightMake = flightMake;
	this.flightCapacity = flightCapacity;
	this.active = active;
	
}

         public Flight(String string, String string2, String string3, String string4) {
	// TODO Auto-generated constructor stub
}

		 public void displayFlight() {
        	 
        	 System.out.println("Flight Code :"+flightCode);
        	 System.out.println("Flight Name :"+flightName);
        	 System.out.println("Flight Make :"+flightMake);
        	 System.out.println("FlightCapacity :"+flightCapacity);
        	 System.out.println("Status  :"+(active ? "Active":"Inactive")); }
        	 
        	 public void setStatus(boolean active) {
        		 this.active = active;
        		 
        	 }

                  public class FlightRegistration {    	  
                	  
                  }
                	  public static void main(String[] args) {
                		  
                		  Scanner sc = new Scanner(System.in);
                		  
                		  System.out.println("Enter Flight Code:");
                		    String code = sc.nextLine();
                		    
                          System.out.println("Enter Flight Name:");
                            String name = sc.nextLine();
                            
                          System.out.println("Enter Flight Make:");
                            String make = sc.nextLine();
                            
                          System.out.println("Enter Flight Capacity:");
                            int capacity = sc.nextInt();
                		  
                          System.out.println("Is Flight Active? (true/false):");
                            boolean status = sc.nextBoolean();
                            
                          Flight flight = new Flight(code,name,make,capacity,status);
                          
                            flight.displayFlight();
                            
                           System.out.println("\nChange Flight Status (true/false):");
                           
                            boolean newStatus = sc.nextBoolean();
                          
                            flight.setStatus(newStatus);
                          
                            System.out.println("\nUpdated Flight Info:");
                          
                            flight.displayFlight();
                            
                            
                            sc.close();
						
				    	}

					  public void updateFlight() {
						// TODO Auto-generated method stub
						
					  }
                	
                   }

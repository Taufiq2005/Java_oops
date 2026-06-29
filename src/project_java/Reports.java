package project_java;

import java.util.Scanner;

public class Reports {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int choice;
		
		do {
			
			System.out.println("\n===== REPORTS MODULE =====");
			System.out.println("1.Flight Report");
			System.out.println("2.Customer Report");
			System.out.println("3.Ticket Booking Report");
			System.out.println("4.Most Profitable Route");
			System.out.println("5.Exit");
			System.out.println("Enter Your Choice:");
			
			choice = sc.nextInt();
			
			switch (choice) {
			
			case 1:
				 System.out.println("\n--- Flight Report ---");
				 System.out.println("Total Flights:100");
				 System.out.println("Active Flights:50");
				 break;
				 
			case 2:
				 System.out.println("\n--- Customer Reports ---");
				 System.out.println("Total Customers:1500");
				 break;
				 
			case 3:
				 System.out.println("\n--- Ticket Booking Route ---");
				 System.out.println("Total Tickets Booked:900");
				 break;
				 
			case 4:
				 System.out.println("\n--- Most Profitable Route ---");
				 System.out.println("Chennai -> Dubai");
				 System.out.println("Profit:30,00,000");
				 break;
				 
			case 5:
				 System.out.println("Exiting Report Module...");
				 break;
				 
			 default:
				 System.out.println("Invalid Choice..!");
				 
			}
		
     	} while (choice!=5);
		
		sc.close();

    }
	
}	

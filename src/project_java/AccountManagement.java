package project_java;

import java.util.Scanner;

public class AccountManagement {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double transactionAmount = 0;
		double commission = 0;
		
		while(true) {
			
			System.out.println("\n==== ACCOUNT MANAGEMENT ====");
			System.out.println("1.Add Transaction");
			System.out.println("2.View Transaction");
			System.out.println("3.Account Summary");
			System.out.println("4.Exit");
			System.out.println("Enter Choices:");
		
			int choice = sc.nextInt();
			
			switch (choice) {
			
			case 1:
				
				System.out.println("Enter Transaction Amount:");
			     transactionAmount = sc.nextDouble();
			     commission = transactionAmount*0.5;
			     System.out.println("Transaction Added Successfully !");
			     break;
			     
		    case 2:	     
		    	
		    	System.out.println("\n=== TRANSACTION DETAILS ===");
			     System.out.println("Amount:Rs."+ transactionAmount);
			     break;
			     
		    case 3:
		    	
		    	System.out.println("\n=== ACCOUNT SUMMARY ===");
			     System.out.println("Total Revenue:Rs."+ transactionAmount);
			     System.out.println("Commission Earned:Rs."+ commission);
			     break;
			     
		    case 4:
		    	
		    	System.out.println("Exiting...");
		    	 sc.close();
		    	 System.exit(0);
		    	 
		    default :
		    	
		    	System.out.println("Invalid Choice!");
		    	
			     }
			
	    	}
			
	   }

 }

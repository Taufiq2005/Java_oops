package project_java;

import java.util.Scanner;

public class TicketCancellation {
	
	String ticketNumber;
	double ticketAmount;
	double refundAmount;
	
public void cancelTicket() {
	
	  Scanner sc = new Scanner (System.in);
	  
	  System.out.println("==== TICKET CANCELLATION & REFUND ====");
	  
	  System.out.println("Enter Ticket Number:");
	  ticketNumber = sc.nextLine();
	  
	  System.out.println("Enter Ticket Amount:");
	  ticketAmount = sc.nextDouble();
	  
	  System.out.println("Enter Dys Before Journey:");
	  int daysBeforeJourney = sc.nextInt();
	  
	  
	  if(daysBeforeJourney>30) {
		  refundAmount = ticketAmount*1.00;
	  } else if(daysBeforeJourney>15) {
		  refundAmount = ticketAmount*0.75;
	  }else if(daysBeforeJourney>7) {
		  refundAmount = ticketAmount*0.50;
	  }else {
		  refundAmount = 0;
	  }
	  
	  System.out.println("\n====== CANCELLATION DETAILS======");
	  System.out.println("Ticket Number:"+ ticketNumber);
	  System.out.println("Original Amount:Rs."+ ticketAmount);
	  System.out.println("Refund Amount:Rs."+ refundAmount);
	  System.out.println("Ticket Cancelled Successfully !");
	  
	  sc.close();
	  
	  
	  }

         public static void main(String[] args) {
			
        	 TicketCancellation tc = new TicketCancellation();
        	 tc.cancelTicket();
        	 
		}
       
  }    





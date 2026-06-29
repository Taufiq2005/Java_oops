package project_java;

import java.util.Scanner;

class TicketReservation {

    String flightCode;
    String passengerName;
    int age;
    int availableSeats = 100;

    @SuppressWarnings({ "unused", "resource" })
	public void bookTickets() {

        Scanner sc = new Scanner(System.in);

        System.out.println("==== AIRLINES TICKET RESERVATION ====");

        System.out.print("Enter Flight Code: ");
        flightCode = sc.nextLine();

        System.out.print("Enter Number of Seats Required: ");
        int seatsRequired = sc.nextInt();
        sc.nextLine();

        if (seatsRequired > availableSeats) {
            System.out.println("Sorry! Seats Not Available");
            return;
        }

        System.out.println("\nSeats Available: " + availableSeats);

        System.out.print("Enter Passenger Name: ");
        passengerName = sc.nextLine();

        System.out.print("Enter Age: ");
        age = sc.nextInt();
        sc.nextLine();

        System.out.println("\n=== PAYMENT DETAILS ===");

        System.out.print("Enter Card Number: ");
        String cardNumber = sc.nextLine();

        System.out.print("Enter Card Holder Name: ");
        String cardHolder = sc.nextLine();

        System.out.print("Enter Amount: ");
        double amount = sc.nextDouble();

        availableSeats -= seatsRequired;

        System.out.println("\nPayment Successful!");

        System.out.println("\n===== TICKET =====");
        System.out.println("Flight Code     : " + flightCode);
        System.out.println("Passenger Name  : " + passengerName);
        System.out.println("Age             : " + age);
        System.out.println("Seats Booked    : " + seatsRequired);
        System.out.println("Amount Paid     : " + amount);
        System.out.println("Ticket Status   : CONFIRMED");
        System.out.println("==================");

        sc.close();
        
    }
    
}

public class TicketReservationMain {

    public static void main(String[] args) {

        TicketReservation reservation = new TicketReservation();
        reservation.bookTickets();

    }
    
}
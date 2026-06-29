package project_java;

import java.util.Scanner;

class FlightUpd {

    String flightCode;
    String flightName;
    String flightMake;
    int flightCapacity;
    boolean active;

    public FlightUpd(String flightCode, String flightName, String flightMake, int flightCapacity, boolean active) {
                     

        this.flightCode = flightCode;
        this.flightName = flightName;
        this.flightMake = flightMake;
        this.flightCapacity = flightCapacity;
        this.active = active;
    }

    public void updateFlight() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter New Flight Code: ");
        flightCode = sc.nextLine();

        System.out.println("Enter New Flight Name: ");
        flightName = sc.nextLine();

        System.out.println("Enter New Flight Make: ");
        flightMake = sc.nextLine();

        System.out.println("Enter New Flight Capacity: ");
        flightCapacity = sc.nextInt();

        System.out.println("Flight Active (true/false): ");
        active = sc.nextBoolean();

        System.out.println("Flight Details Updated Successfully!");
        sc.close();
    }

    public void displayFlight() {

        System.out.println("\nFlight Code : " + flightCode);
        System.out.println("Flight Name : " + flightName);
        System.out.println("Flight Make : " + flightMake);
        System.out.println("Flight Capacity : " + flightCapacity);
        System.out.println("Status : " + (active ? "Active" : "Inactive"));
    }
}

public class FlightUpdateDemo {

    public static void main(String[] args) {

        Flight flight = new Flight("AI103","Air India","Boeing 735",200,true);

        System.out.println("Existing Flight Details:");
        flight.displayFlight();

        flight.updateFlight();

        System.out.println("\nUpdated Flight Details:");
        flight.displayFlight();
    }
    
}

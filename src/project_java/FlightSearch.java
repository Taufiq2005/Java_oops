package project_java;

import java.util.Scanner;

class FlightSrh {

    String code, source, destination, date;


    FlightSrh(String code, String source, String destination, String date) {
        this.code = code;
        this.source = source;
        this.destination = destination;
        this.date = date;
    }

    void display() {
    	
    	
        System.out.println("Flight Code : " + code);
        System.out.println("Flight Source : " + source);
        System.out.println("Flight Destination : " + destination);
        System.out.println("Flight Date : " + date);
        System.out.println();
        
    }
    
}

public class FlightSearch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        FlightSrh f1 = new FlightSrh("AI110","Kerala","Chennai","15.05.2026");
        
        FlightSrh f2 = new FlightSrh("AI115","Thirchy","Delhi","20.05.2026");
        
        FlightSrh f3 = new FlightSrh("IA120","Kerala","Chennai","15.05.2026");

        System.out.print("Enter Source : ");
        String src = sc.nextLine();

        System.out.print("Enter Destination : ");
        String dest = sc.nextLine();

        System.out.print("Enter Date : ");
        String date = sc.nextLine();
        
        boolean found = false;

        if(f1.source.equalsIgnoreCase(src) &&
           f1.destination.equalsIgnoreCase(dest) &&
           f1.date.equals(date)) {
            f1.display();
            found = true;
        }

        if(f2.source.equalsIgnoreCase(src) &&
           f2.destination.equalsIgnoreCase(dest) &&
           f2.date.equals(date)) {
            f2.display();
            found = true;
        }

        if(f3.source.equalsIgnoreCase(src) &&
           f3.destination.equalsIgnoreCase(dest) &&
           f3.date.equals(date)) {
            f3.display();
            found = true;
        }
        
        if(!found) {
        	System.out.println("No Flights Available");
        }

        sc.close();
    }
    
}
           
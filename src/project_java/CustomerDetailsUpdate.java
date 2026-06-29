package project_java;

import java.util.Scanner;

public class CustomerDetailsUpdate {

    String customerName;
    String mobileNumber;
    String address;

    public CustomerDetailsUpdate(String customerName, String mobileNumber, String address) {
        this.customerName = customerName;
        this.mobileNumber = mobileNumber;
        this.address = address;
    }

    public void displayDetails() {
        System.out.println("\n--- Customer Details ---");
        System.out.println("Name    : " + customerName);
        System.out.println("Mobile  : " + mobileNumber);
        System.out.println("Address : " + address);
    }

    public void updateMobile(String newMobile) {
        mobileNumber = newMobile;
        System.out.println("Mobile Number Updated Successfully!");
    }

    public void updateAddress(String newAddress) {
        address = newAddress;
        System.out.println("Address Updated Successfully!");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        CustomerDetailsUpdate customer =
                new CustomerDetailsUpdate("Taufiq", "9876543210", "Chennai");

        int choice;

        do {
            System.out.println("\n=== CUSTOMER DETAILS UPDATE ===");
            System.out.println("1. View Details");
            System.out.println("2. Update Mobile Number");
            System.out.println("3. Update Address");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    customer.displayDetails();
                    break;

                case 2:
                    System.out.print("Enter New Mobile Number: ");
                    String mobile = sc.nextLine();
                    customer.updateMobile(mobile);
                    break;

                case 3:
                    System.out.print("Enter New Address: ");
                    String address = sc.nextLine();
                    customer.updateAddress(address);
                    break;

                case 4:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);

        sc.close();
     }
    
 }
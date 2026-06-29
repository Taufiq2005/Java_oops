package project_java;

import java.util.Scanner;

public class CustomerRegistration {

    String customerName;
    String email;
    String phone;
    String password;

    public void registerCustomer() {
    	
        Scanner sc = new Scanner(System.in);

        System.out.println("===== CUSTOMER REGISTRATION =====");

        System.out.print("Enter Customer Name:");
        customerName = sc.nextLine();

        System.out.print("Enter Email:");
        email = sc.nextLine();

        System.out.print("Enter Phone Number:");
        phone = sc.nextLine();

        System.out.print("Create Password:");
        password = sc.nextLine();

        System.out.println("\nCustomer Registered Successfully!");
        
      }

    public void viewCustomer() {
    	
        System.out.println("\n===== CUSTOMER DETAILS =====");
        System.out.println("Name :" + customerName);
        System.out.println("Email :" + email);
        System.out.println("Phone :" + phone);
        System.out.println("Special Offers Available: YES");
         
      }

   public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        CustomerRegistration customer = new CustomerRegistration();

        int choice;

        do {
        	
            System.out.println("\n===== CUSTOMER MENU =====");
            System.out.println("1. Register Customer");
            System.out.println("2. View Customer Details");
            System.out.println("3. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
            
                case 1:
                	
                    customer.registerCustomer();
                    break;

                case 2:
                	
                    customer.viewCustomer();
                    break;

                case 3:
                	
                    System.out.println("Exiting...");
                    break;

                default:
                	
                    System.out.println("Invalid Choice!");
                    
             }

                } while (choice != 3);

                    sc.close();
        
             }
    
         }
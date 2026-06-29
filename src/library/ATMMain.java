package library;

import java.util.Scanner;

public class ATMMain {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		AccountDAO dao = new AccountDAO();
		
		System.out.println("Enter Account no:");
		int accNo = sc.nextInt();
		
		dao.showBalance(accNo);
		
	}

}

package excepprogs;

import java.util.Scanner;

@SuppressWarnings("serial")
class InsufficientException extends Exception

{


	public InsufficientException(String msg)
	
	{
		super(msg);
	}
}
class Transaction

{
	double balance;
	
	public double deposit(double amount)
	
	{
		balance = balance + amount;
		return balance;
	}
	
	public void withdraw(double amount) throws InsufficientException
	
	{
		if(amount > balance)
		{
			throw new InsufficientException("Check your balance");
		}
		else
			
		{
			balance -= amount;
			System.out.println(balance);
		}
			
	}
	
}
public class Excep5 {

	public static void main(String[] args) {
		int amount;
		Transaction t = new Transaction();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount to deposit");
		amount= sc.nextInt();
		
		System.out.println(t.deposit(amount));
		
		System.out.println("Enter amount to withdraw");
		amount= sc.nextInt();
		try
		{
		t.withdraw(amount);
		}
		catch(InsufficientException i)
		{
			System.out.println(i);
		}
		
		sc.close();
	}
}


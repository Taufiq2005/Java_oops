	
	import java.util.Scanner;

	public class ShopSales {
		
	    public static void main(String[] args) {
	        double[] prices = {22.5, 44.5, 9.98};
	        Scanner sc = new Scanner(System.in);
	        double total = 0;

	        while (true) {
	            System.out.print("Enter product number (1-3) or -1 to stop: ");
	            int p = sc.nextInt();
	            if (p == -1) break;
	            if (p < 1 || p > 3) {
	                System.out.println("Invalid product!");
	                continue;
	            }
	            System.out.print("Enter quantity: ");
	            int q = sc.nextInt();
	            total += prices[p - 1] * q;
	        }

	        System.out.println("Total sales = " + total);
	        sc.close();
	    }
	}




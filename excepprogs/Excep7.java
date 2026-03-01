package excepprogs;

   public class Excep7 {
	
	static void x(int a, int b)
	
	{
		try
		{
			
		System.out.println(a/b);
		
		}catch(ArithmeticException ae)
		{
			//System.out.println(ae);
			ae.printStackTrace();
		}
		
	}
	
	static void y()

	{
		x(3,0);
	}
	
	static void z()
	{
		y();
	}
	
	public static void main(String[] args) {
		z();
		System.out.println("Main");
	}
}



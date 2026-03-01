package excepprogs;

     public class Excep6 {
	
	      static int greatest(int a, int b)
	
	{
		try
		{
			if(a>b)
			
		{
			return a;
		}
		
		else
			
			   return b;
		}
		
		catch(Exception e) {System.out.println("Exception raised");}
		finally
		
		{
			
			System.out.println("Finally block executed");
		}
		
		    return 0;
		
	}
	
	public static void main(String[] args)
	
	{
		
		  System.out.println(greatest(4, 6));
		
	}

}



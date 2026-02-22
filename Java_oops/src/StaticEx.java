
/*class StaticEx  // Top level classes cannot be static
{
	static class inner{ // inner classes can be static
		
	}
	static int a=0;  // only once - static variables cannot be re-initialized
	public StaticEx() {
	
		System.out.println(a++);
	}
	
	static void disp()  // static methods can able to access only static members
	{
		System.out.println(a);
	}
}*/

class StaticEx
{
	StaticEx()
	{
		System.out.println("Constructor");
	}
	
	static 
	{
		System.out.println("Static block");
	}
	
	{
		System.out.println("Non-static block");
	}
	
	static void disp()
	{
		System.out.println("Method");
	}
}

public class StaticDemo {

	
	public static void main(String[] args) {
		
		System.out.println("Main");
			StaticDemo st = new StaticDemo();
			StaticEx.disp();
		}
}


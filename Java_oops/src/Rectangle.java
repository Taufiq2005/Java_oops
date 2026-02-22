
public class Rectangle 
{
	int l,b;
	Rectangle()
	{
		System.out.println("Default constructor");
		l=10;
		b=20;
	}
	
	Rectangle(int l,int b)  // local variable
	{
		this();  // constructor chaining
		System.out.println("Parameterized constructor");
		this.l=l;
		this.b=b;
	}
	void area()
	{
		System.out.println(l*b);
	}


public class constructorEx {

	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle(5,7);
		
		r1.area();
	}
	
}	

}
	
	



inal class Emp // class cannot be inherited;
{

	final int x=1;  // Cons 
	
	final void show() // final methods cannot be overridden
	{
		//x=10;
		System.out.println("Emp : "+x);
	}


class Dept extends Emp
{
	void show1()  
	{
		System.out.println("Dept : "+x);
	}
}

public class ClassDemo {

	public static void main(String[] args) {
		Dept d = new Dept();
		
		d.show();
	}
}
}


package ex_28_Static;

public class Lab_219 {

	public static void main(String[] args)
	{
		A p1= new A();
		A p2= new A();
		System.out.println(A.a);
		System.out.println(p1.a);
		p1.a=12;
		System.out.println(p1.a);
		System.out.println(p2.a);
		p1.b=14;
		System.out.println(p1.b);
		System.out.println(p2.b);
		
		

	}

}

class A
{
	static int a=10;
	int b=20;
	
	 static {
	        // This is static block.
	        // This is called whenever a class a loaded.
	        System.out.println("Hi, this is called, becoz, class is laoded");


	        // The usage of static block is if you want to call some of the methods, like calling a database connection, calling an Excel collection


	    }


	
}

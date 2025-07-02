package JavaTest1;

public class P5 {

	public static void main(String[] args)
	{
		byte a=10;
		int b=a;//  Widening -> Implicit Casting
		byte c=(byte)a;//wedding ->Explicit casting
		
	    int val=500;
	    //byte d=val;Narrowing ->Implicit Casting is not allowed
	    byte e=(byte)val;//Narrowing ->Explicit Casting 
	    System.out.println(c);
	    System.out.println(e);
	    

	}

}

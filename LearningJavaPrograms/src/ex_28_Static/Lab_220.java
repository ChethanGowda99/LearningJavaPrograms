package ex_28_Static;

public class Lab_220 {

	public static void main(String[] args) 
	{
		
		// TODO Auto-generated method stub
		
		  B ref1 = new B(10);
		  B ref2 = new B(11);
		  System.out.println(ref1.a);
		  System.out.println(B.b);
		  System.out.println(ref2.a);
		  System.out.println(ref1.b);
	        System.out.println(ref2.b);
	        ref1.displayValue();
	        ref2.displayValue();
	        B.staticMethod();
	        ref1.staticMethod();
	        


	}

}
class B
{
    int a; //  non static - instance variable
    static int b = 20; // static this is shared between - objects

    B(int a){
        this.a = a;
    }
    void displayValue(){
        System.out.println(this.a);
        System.out.println(b); // static variable in instance method allowed
    }
    static void staticMethod(){
        System.out.println("I will be called when class is loaded");
        //System.out.println(this.a); // Methods cannot access non-static variables in a static function.
    }

    
    
}

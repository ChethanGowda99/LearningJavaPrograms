package ex_20_Accessmodifiers;

public class Lab_160_Protected {
}


	class Parent 
	{
	    protected int number = 30;

	    protected void show() {
	        System.out.println("Protected Method: " + number);
	    }
	}

	class Child extends Parent {
	    void display() {
	        show(); // ✅ allowed via inheritance
	    }
	}
package ex_15_OOPs;

public class Lab_137 {

	  public static void main(String[] args) {
	        Cat c1 = new Cat();
	        new Cat();
	        Cat c2;

	        c1.running();
	       // c2.running();
	        new Cat().running();





	    }
	}

	class Cat{
	    String name; // null

	    void running() {
	        System.out.println("Running");
	    }
	}
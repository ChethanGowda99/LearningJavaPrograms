package ex_33_Collections_framework_dsa.List;

import java.util.ArrayList;
import java.util.List;

public class Lab_257_ArrayList {

	public static void main(String[] args) {
	
		ArrayList arraylist=new ArrayList();
		
		arraylist.add("chethan");
		arraylist.add("ms");
		arraylist.add(123);//different data types
		arraylist.add(null);
		arraylist.add(true);
		  System.out.println(arraylist);
		  System.out.println(arraylist.size());
		  System.out.println(arraylist.isEmpty());

		  
		  
		  

	        List l = new ArrayList(); // Dynamic Dispatch
	        l.add("123");
	        l.add("456");
	       // System.out.println(l);
	       // System.out.println(l.isEmpty());

	        List l2 = new ArrayList();
	       // System.out.println(l2.isEmpty());
	        List l1 = new ArrayList();
	        System.out.println(l1.isEmpty());
	        



		  
		
		

	}

}

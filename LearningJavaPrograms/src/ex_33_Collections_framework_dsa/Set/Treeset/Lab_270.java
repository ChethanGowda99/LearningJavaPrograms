package ex_33_Collections_framework_dsa.Set.Treeset;

import java.util.Set;
import java.util.TreeSet;

public class Lab_270 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Set ts  = new TreeSet();
		   ts.add("Dapple");
	        ts.add("Apple");
	        ts.add("apple");
	        ts.add("Orange");
	        ts.add("WaterMelon");
	        //ts.add(123);
	        //ts.add(null);
	        System.out.println(ts);
	        
	        
	        // Black and Red Tree mechanism to store the element.
	        // order will maintain, Natural Sorting is done.
	        // Natural Sorting - ASCII values.
	        

	        System.out.println(" ----- For Each ---- ");

	        for(Object o:ts){
	            System.out.println(o);
	        }

	}

}

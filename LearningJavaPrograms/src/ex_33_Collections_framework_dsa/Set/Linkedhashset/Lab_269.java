package ex_33_Collections_framework_dsa.Set.Linkedhashset;

import java.util.LinkedHashSet;
import java.util.Set;

public class Lab_269 {

	public static void main(String[] args) {
	
		Set ls =new LinkedHashSet();
		 // LinkedList mechanism to store the element,
        // order will maintain, no duplicates
		 ls.add("Dpple");
		 ls.add("apple");
		 ls.add("Orange");
		 ls.add("WaterMelon");
		 ls.add("WaterMelon");
		 ls.add(null);
		 System.out.println(ls);
	        System.out.println(ls.isEmpty());
	        System.out.println(ls.contains("Apple"));
	        System.out.println(ls.size());
	        
	        
	        for(Object o:ls){
	            System.out.println(o);
	        }


	}

}

package ex_33_Collections_framework_dsa.Set.Hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Lab_268_set {

	public static void main(String[] args) {
		Set hs=new HashSet();
		 // Hashing mechanism to store the element
        // no order maintained
        // no duplicates
        // e1 -> hashcode (xyz), e2 -> hashcode -> abc
		 hs.add("Apple");
	        hs.add("Orange");
	        hs.add("WaterMelon");
	        hs.add("WaterMelon");
	        hs.add(123);
	        hs.add(null);
//	        
	        System.out.println(hs);

	        for (Object s : hs){
	            System.out.println(s);
	        }
	        System.out.println(" ---------------------------");

	        // Iterator
	        Iterator iterator = hs.iterator();
	        while (iterator.hasNext()){
	            System.out.println(iterator.next());
	        }


	}

}

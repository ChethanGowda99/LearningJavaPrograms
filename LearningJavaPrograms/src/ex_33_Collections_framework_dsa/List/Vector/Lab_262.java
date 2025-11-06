package ex_33_Collections_framework_dsa.List.Vector;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Lab_262 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List v=new Vector();
		 v.add("Pramod");
	        v.add("Amit");
	        v.add("Lucky");
	        System.out.println(v);
	        v.remove("Amit");
	        System.out.println(v.contains("Lucky"));
	        System.out.println(v);

	        for (int i = 0; i < v.size(); i++) {
	            System.out.println(v.get(i));
	        }
	        

	        System.out.println(" ----  For  Each Loop ");

	        for (Object o : v) {
	            System.out.println(o);
	        }
	        Iterator iterator = v.iterator();
	        while(iterator.hasNext()){
	            System.out.println(iterator.next());
	        }

	}

}

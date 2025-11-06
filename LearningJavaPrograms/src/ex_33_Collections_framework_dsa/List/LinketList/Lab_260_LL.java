package ex_33_Collections_framework_dsa.List.LinketList;

import java.util.LinkedList;
import java.util.List;

public class Lab_260_LL {

	public static void main(String[] args) {
		List <String>car=new LinkedList<>();
		car.add("Maruthi800");
		car.add("Omini");
		car.add("AltoK10");
		car.add("Swift");
		car.add("Swift");
		  System.out.println("LinkedList :"+car);
		  // Accessing elements
		  System.out.println("First Element :"+car.getFirst());
		  System.out.println("Last Element :"+car.getLast());
		  // Removing elements
		  System.out.println("Remove 1st Element :"+car.removeFirst());
		  System.out.println("Remove 2nd Element :"+car.getLast());
		  System.out.println("After Remove Element :"+car);
		  System.out.println("Size of an Element :"+car.size());
		  
		  
		  
		
		

	}

}

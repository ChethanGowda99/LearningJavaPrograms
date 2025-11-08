package ex_33_Collections_framework_dsa.List.Stack;

import java.util.Stack;

public class Lab_267_Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Stack s1 = new Stack();
	        s1.add("python");
	        s1.add("c#");
	        s1.add("Java");

	        System.out.println(s1);
	        System.out.println(s1.peek());
	        System.out.println(s1.pop());
	        System.out.println(s1);
	        

	        // Create Integer type stack
	        Stack<Integer> intStack = new Stack<>();
	        // Create String type stack
	        Stack<String> stringStack = new Stack<>();
	        intStack.push(23);
	        intStack.push(43);
	        intStack.push(53);
	        System.out.println(intStack);
	}

}

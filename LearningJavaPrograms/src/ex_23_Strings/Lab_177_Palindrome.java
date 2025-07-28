package ex_23_Strings;

import java.util.Scanner;

public class Lab_177_Palindrome {

	public static void main(String[] args) 
	{
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter the string");
    String input=s1.next();
    String newString_reversed = reverseString(input);
    
    if(newString_reversed.equalsIgnoreCase(input))
    {
    	System.out.println("Palindrome");
    	 
	}else
	{
		System.out.println("Not a palindrome");
	}


	}
	public static String reverseString(String input) {
        String reversed = "";
        for(int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        return reversed;
    }

}

package JavaTest1;

import java.util.Scanner;

public class P7 {

	public static void main(String[] args)
	{
		 Scanner scanner = new Scanner(System.in);
		  // Input three numbers from the user

	        // Input three numbers from the user
	        System.out.print("Enter the first number: ");
	        double num1 = scanner.nextDouble();

	        System.out.print("Enter the second number: ");
	        double num2 = scanner.nextDouble();

	        System.out.print("Enter the third number: ");
	        double num3 = scanner.nextDouble();
	        
	        if(num1>num2 &&num1>num3)
        {
        	System.out.println("First number is largest");
        }
        else if(num2>num3&&num2>num1)
        {
        	System.out.println("Second number is largest ");
        	
        }
        else
        {
        	System.out.println("Third number is largest ");
        }
        

	}

}

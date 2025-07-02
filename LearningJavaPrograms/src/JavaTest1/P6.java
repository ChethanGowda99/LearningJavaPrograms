package JavaTest1;

import java.util.Scanner;

public class P6 {

	public static void main(String[] args)
	{  
		//user input
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Enter the number");
		int num=scanner.nextInt();
		

		if(num>0) 
		{ System.out.println("Given number is Positive");
		}
		else if(num<0)
		{System.out.println("Given number is negative");
		}
		else
		{System.out.println("Given nunber is zero");
		}
		}
	}



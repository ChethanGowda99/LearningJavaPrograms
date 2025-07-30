package ex_25_Arrays2D;

import java.util.Scanner;

public class Lab_194_PrintLeftTriangle {
	public static void main(String[] args) 
	{
		Scanner size=new Scanner(System.in);
		System.out.println("Enter the Size");
		int n=size.nextInt();
		
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=i;j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
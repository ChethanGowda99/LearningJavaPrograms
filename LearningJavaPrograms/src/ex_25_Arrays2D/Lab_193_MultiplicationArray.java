package ex_25_Arrays2D;

import java.util.Scanner;

public class Lab_193_MultiplicationArray {
	public static void main(String[] args) 
	{
		Scanner size=new Scanner(System.in);
		System.out.println("Enter teh Size");
		int n=size.nextInt();
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(i*j);
			}
			System.out.println();
		}

	}

}
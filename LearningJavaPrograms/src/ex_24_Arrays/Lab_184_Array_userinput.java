package ex_24_Arrays;

import java.util.Scanner;

public class Lab_184_Array_userinput {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();
		
		int[]marks=new int[size];
		
		for(int i=0;i<marks.length;i++) {
			
			System.out.println("Enter the numbers");
			marks[i]=sc.nextInt();
		}
	      System.out.println(" ---- Below Code is printing the elements! ");

	        for (int i = 0; i < marks.length ; i++) {
	            System.out.println(marks[i]);
	        }

	}

}

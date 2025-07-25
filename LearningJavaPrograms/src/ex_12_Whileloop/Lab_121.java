package ex_12_Whileloop;
import java.util.Scanner;

public class Lab_121 
{

	public static void main(String[] args) 
	{
        // Factorial Program
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Factorial Program\nEnter the number!");
        if(!scanner.hasNextInt()){
            System.out.println("Enter the int you fool!");
            return;
        }

        int number = scanner.nextInt();

        long factorial = 1;
	}
}

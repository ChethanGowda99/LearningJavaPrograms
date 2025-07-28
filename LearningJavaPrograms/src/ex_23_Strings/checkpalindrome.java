package ex_23_Strings;

import java.util.Scanner;

public class checkpalindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // Remove spaces and convert to lowercase for accurate comparison
        String cleanedInput = input.replaceAll("\\s+", "").toLowerCase();

        // Reverse the string
        String reversed = new StringBuilder(cleanedInput).reverse().toString();

        // Check if input is equal to its reversed version
        if (cleanedInput.equals(reversed)) {
            System.out.println("The given string is a palindrome.");
        } else {
            System.out.println("The given string is not a palindrome.");
        }

        scanner.close();
    }
}
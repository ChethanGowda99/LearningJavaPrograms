package ex_26_Exceptions;

public class Lab_201_Try_Catch_IQ {
	 public static void main(String[] args) {
	        try {
	            int a = 10 / 0;
	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }
	    }
	}
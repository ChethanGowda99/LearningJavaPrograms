package ex_32_Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.File;

public class Lab_249 {

	public static void main(String[] args) {

	        System.out.println("Starting");

	        try {
	            FileReader f = new FileReader(new File("C://abc.txt"));
	        } catch (FileNotFoundException e) {
	            System.out.println(e.getMessage());
	        }

	        System.out.println("End");
	    }
	}
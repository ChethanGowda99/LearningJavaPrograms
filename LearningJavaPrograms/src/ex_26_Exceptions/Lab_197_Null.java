package ex_26_Exceptions;

public class Lab_197_Null {

    public static void main(String[] args) {
        String name= null; // java.lang.NullPointerException
        name.trim();
    }
}
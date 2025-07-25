package ex_05_TypeCasting;

public class Lab59_Typecasting {

	public static void main(String[] args) {
		  int val  = 300;
//        byte b = val; // Narrowing (int -> byte) - Implicit Casting is not allowed.
        byte b1 = (byte)val; // Narrowing (int -> byte) - Explicit Casting is not allowed.
        // Data Loss.
        System.out.println(b1);

	}

}

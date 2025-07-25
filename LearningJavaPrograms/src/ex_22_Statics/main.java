package ex_22_Statics;

public class main {
	    public static void main(String[] args)
	    {
	        System.out.println("Number: " + Init.num);
	    }
	}
class Init {
    static int num;

    static {
        num = 10;
        System.out.println("Static block executed.");
    }
}

package ex_10_Switch;

public class Lab95_Interview {

	public static void main(String[] args) {
	       // in JDK > 13
        //  No need of break keyword
        // one line supported.
        int itemCode = 002;
        switch (itemCode){
            case 001 -> System.out.println("001");
            case 002 -> System.out.println("002");
            case 003 -> System.out.println("003");
            default -> System.out.println("Default");

        }
    }
}

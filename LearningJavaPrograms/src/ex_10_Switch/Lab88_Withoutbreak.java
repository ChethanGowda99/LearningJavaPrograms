package ex_10_Switch;

public class Lab88_Withoutbreak {

	public static void main(String[] args) {

int day=1;

        switch (day) {

            case 1:
                System.out.println("Mon");

            case 2:
                System.out.println("Tue");

            case 3:
                System.out.println("Wed");
            case 4:
                System.out.println("Thur");
            case 5:
                System.out.println("Friday");
            case 6:
                System.out.println("Sat");
            case 7:
                System.out.println("Sun");
            default:
                System.out.println("Invalid, day number");


        }
    }
}

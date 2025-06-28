package EX_06_TernaryOperator;

public class Lab67 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // age = 23
        //  age < 18 ->  Minor
        //  18 < age > 65 ->  Adult
        // age > 65 -> Senior Citizen
        int age = 76;
        String result =  (age < 18 ) ? "Minor" : (age < 65) ? "Adult": "Senior";
        System.out.println(result);

	}

}

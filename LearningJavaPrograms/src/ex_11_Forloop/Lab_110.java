package ex_11_Forloop;

public class Lab_110 {

	public static void main(String[] args) {
	     //  Find the even numbers from 1 to 50.
        for (int i = 1; i <= 50 ; i++) {  // 1 to 50 . Times -> 50
            // i%2 ==0
            if(i%2 == 0)
            {
                System.out.println("even! -> " + i);
            }
        }

	}

}

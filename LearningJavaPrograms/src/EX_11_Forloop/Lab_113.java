package EX_11_Forloop;

public class Lab_113 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        for (int i = 0; i <= 25; i++) { // 0 to 50, 51 Times
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("Odd ->" + i);

	}

}
}

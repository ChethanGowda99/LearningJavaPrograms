package ex_23_Strings;

public class Lab_176 {

	public static void main(String[] args) {
		String name4 = "pramod@live.com@123";
        String[] split_name4 = name4.split("@");
        System.out.println(split_name4[0]);
        System.out.println(split_name4[1]);
        System.out.println(split_name4[2]);
        System.out.println(name4.replace('n', 'N'));
	}

}

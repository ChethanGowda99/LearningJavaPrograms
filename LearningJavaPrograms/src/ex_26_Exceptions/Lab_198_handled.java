package ex_26_Exceptions;

public class Lab_198_handled {

	public static void main(String[] args)
	{
		int a=0;
		try {
		a=10/0;
		}catch (Exception e)
		{
			System.out.println("divide by zero");
		}
		
		 System.out.println(a);

	}

}

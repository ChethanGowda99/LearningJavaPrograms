package ex_24_Arrays;

public class Lab_182_Arrays_Max {

	public static void main(String[] args)
	{
		int []marks= {8,5,3,5,1,7};
		int max_output=give_me_max(marks);
		System.out.println(max_output);
	}

	 static int give_me_max(int[] marks)
	{
		int max=marks[0];
		for(int i=0;i<marks.length;i++)
		{ if(marks[i]>max)
		{  max=marks[i];
		
		}
		}
	
		return max;
	}

}

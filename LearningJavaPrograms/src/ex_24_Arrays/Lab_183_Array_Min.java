package ex_24_Arrays;

public class Lab_183_Array_Min {

	public static void main(String[] args) {
		
		
			int []marks= {8,5,3,5,1,7};
			int min_output=give_me_min(marks);
			System.out.println(min_output);
		}

		 static int give_me_min(int[] marks)
		{
			int min=marks[0];
			for(int i=0;i<marks.length;i++)
			{ if(marks[i]<min)
			{  min=marks[i];
			
			}
			}
		
			return min;
		}

	}

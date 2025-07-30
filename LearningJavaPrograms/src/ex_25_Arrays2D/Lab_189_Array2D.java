package ex_25_Arrays2D;

public class Lab_189_Array2D {

	public static void main(String[] args) 
	{
		int [][]Array2D= {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int i=0;i<Array2D.length;i++) {
			for(int j=0;j<Array2D[i].length;j++) {
				System.out.print(Array2D[i][j]);
			}
			System.out.println();
			
		}
		
	}

}

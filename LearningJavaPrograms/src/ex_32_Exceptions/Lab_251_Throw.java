package ex_32_Exceptions;

public class Lab_251_Throw {

	public static void main(String[] args) {
		
	}
		    
		    static void divideByZero(int a ){
		        if(a ==0){
		            throw new ArithmeticException("Error a == 0");
		        }
		    }
}
		
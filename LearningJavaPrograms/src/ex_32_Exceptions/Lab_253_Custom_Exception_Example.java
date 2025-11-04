package ex_32_Exceptions;

public class Lab_253_Custom_Exception_Example {

	public static void main(String[] args) throws CurrencyMisMatchCustomException {
		 Bank sbi = new Bank("INR",100);
	        Bank icici = new Bank("INR",123);
	        int total  = sbi.add(icici);
	        System.out.println(total);

	     
	}

}

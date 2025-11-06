package ex_16_Constructors;

public class Lab_142 {

	public static void main(String[] args) {
		Car c1=new Car();
		c1.name="Tesla";
		System.out.println(c1.name);
		System.out.println(c1.model);
		System.out.println(c1.year);
		BabyC b1=new BabyC();
		b1.name="tanisha";
		System.out.println(b1.name);
	}

}

class Car{
	
	String name;
	int year;
	String model;
	
	//DC
	Car()
	{
		name="unknown";
		year=1999;
		model="xxxx";
	}
}

class BabyC{
	
	  String name;
	  
	  BabyC()
	  {
		  name="appu";
	  }
}
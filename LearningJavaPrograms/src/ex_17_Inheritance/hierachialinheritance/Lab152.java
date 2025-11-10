package ex_17_Inheritance.hierachialinheritance;

public class Lab152 { 
	public static void main(String[] args)
	{
    Father f1 = new Father();
    f1.home();
    
    Pramod p1=new Pramod();
    p1.home();
    p1.h2();
    
    Lucky l1 =new Lucky();
    l1.home();
    l1.l2();
    
    

	}
   

}
	class Father
	{
		void home () {
			System.out.println("3BHK");
		}
	}
	
	class Pramod extends Father
	{
		void h2()
		{
			System.out.println("h2-Pramod");
		}
		
	}
	class Lucky extends Father
	{
		void l2()
		{
			System.out.println("lucky");
		}
		
	}
	

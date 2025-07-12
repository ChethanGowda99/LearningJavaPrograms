package EX_17_Inheritance;

public class Lab_146 
{
	public static void main(String[] args)
	{
		Father f1=new Father();
		f1.bhk2();
		System.out.println(f1.gold_f);
		Son s1=new Son();
		s1.bhk2();
		s1.bhk3();

	}
}
class Father
{
	int gold_f=1000;
	
void bhk2()	
{ 
	System.out.println("father-2bhk");
	}

}
class Son extends Father
{
	void bhk3()
	{
		System.out.println("son-3bhk");
	}
	}



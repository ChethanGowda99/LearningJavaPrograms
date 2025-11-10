package ex_17_Inheritance.multilevelinheritance;

public class Lab_150 {

	public static void main(String[] args) 
	{

	       // Son s1 = new Father();
	       //  Son s1 = new GrandFather();
	        Son amit = new Son();
	        System.out.println(amit.gold_gf);
	        amit.gf();

	        Grandfather grandfather = new Son();
	        grandfather.home();

	}
}

package EX_17_Inheritance.multilevelinheritance;

public class Lab_149 {

	public static void main(String[] args) 
	{
	Son amit = new Son();
    // Son s1 = new Father();
    // Son s1 = new GrandFather();

     Grandfather g1 = new Son(); // Dynamic Dispatch
     g1.gf();
     g1.home();

     Grandfather g2 = new Father();
     g2.home();

     Father f2 = new Son();
     f2.home();

     // WebDriver driver = new ChromeDriver();

     // Father f3 = new GrandFather();


 }
}

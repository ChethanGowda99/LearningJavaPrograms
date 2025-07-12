package EX_17_Inheritance.hierachialinheritance;

public class Lab_152 { 
	public static void main(String[] args)
	{
    Father f1 = new Father();
    Ruhani r1 = new Ruhani();

    r1.home();
    f1.home();

    Pramod p1 = new Pramod();
    p1.home();

    Lucky l1 = new Lucky();
    l1.l2();
    l1.home();

}
}
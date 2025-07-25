package ex_18_polymorphism.methodoveriding;

public class Lab_155 {

	public static void main(String[] args) 
	{
		Dog d1=new Dog();
		d1.sound();

	}
}
class Animal
{
    void sound()
    {
        System.out.println("Default Sound!");
    }

    void A()
    {
    	}
   }
class Dog
{
	void sound()
	{
        System.out.println("Bark!!");
    }

    void methodOverLoad()
    {

    }

    void methodOverLoad(int a)
    {

    }
}



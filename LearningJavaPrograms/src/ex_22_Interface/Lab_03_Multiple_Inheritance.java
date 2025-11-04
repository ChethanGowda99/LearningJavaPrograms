package ex_22_Interface;

public class Lab_03_Multiple_Inheritance {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		  Child c1 = new Child();
	        c1.money();

	}

}
interface Father1{
    void money();
}
interface Father2{
    void money();
}
class Child implements Father1,Father2{


    @Override
    public void money() {
        System.out.println("Child own Money!");
    }
}

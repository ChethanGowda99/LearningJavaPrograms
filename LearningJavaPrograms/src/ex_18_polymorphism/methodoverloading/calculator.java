package ex_18_polymorphism.methodoverloading;

public class calculator {

	public static void main(String[] args) 
   {
        Calc c1 = new Calc();
       int a1= c1.add(3,4);
        double a2=c1.add(3.414,4.56);
        System.out.println(a1);
    }
}

class Calc{

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b)
    {
        return a + b;
    }


}

package ex_22_Statics;

public class Testnonstatics
{

    public static void main(String[] args)
    {
        Bike b1 = new Bike();   // object creation
        b1.showModel();  
        // calling non-static method
    }
}

class Bike {
    String model = "Yamaha";  // non-static variable

    void showModel() {        // non-static method
        System.out.println("Model: " + model);
    }
}


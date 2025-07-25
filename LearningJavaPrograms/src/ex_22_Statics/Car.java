package ex_22_Statics;

public class Car {

    static String brand = "Toyota"; // static variable

    static void displayBrand() {    // static method
        System.out.println("Brand: " + brand);
    }
}

 class TestStatic 
{
    public static void main(String[] args) {
        // Accessing static members without creating object
        Car.displayBrand();
        System.out.println(Car.brand);
    }
}

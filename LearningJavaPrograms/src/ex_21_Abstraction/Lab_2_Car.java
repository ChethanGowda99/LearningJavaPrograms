package ex_21_Abstraction;

public class Lab_2_Car  
{
	public static void main(String[] args) {
    WagonR car  = new WagonR();
    car.drive();
    // Engine e1 = new Engine();
    car.startEngine();
}

}


abstract class GearManagement{
    abstract void gearSet();
}
abstract class Engine {
    abstract void startEngine();

    abstract void stopEngine();

    void checkEngine() {
        System.out.println("Everything is Good!");
    }
}
class WagonR extends Engine{

    @Override
    void startEngine() {
        System.out.println("Starting the car!");
    }

    @Override
    void stopEngine() {
        System.out.println("Stopping the car!");
    }

    void drive(){
        checkEngine();
        startEngine();
        stopEngine();
    }


}

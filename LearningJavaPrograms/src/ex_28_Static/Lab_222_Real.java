package ex_28_Static;

public class Lab_222_Real {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class ATB{

    static {
        System.out.println("Load the class?, I will execute");
    }
    
    {
        System.out.println("IIB - this is called when Object is created!");
        // What is the purpose? -
        // Here you can write code related to
        // start a website or anything before starting the
        // web automation or api automation
        //
    }
    private String name; // non static
    private String phone; // non static
    
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    static String courseName = "ATB13x";
    static String mentorName = "Pramod";
    static void doAssignment(){
        //System.out.println(phone); // Staic method can't access the non static variables
        System.out.println("Do Assignment");
    }
    static void joinZoomForClass(){
        System.out.println("Class Joined!");
    }
    void howTheyAssignment(){
        System.out.println("It is different!");
    }




    
    
}

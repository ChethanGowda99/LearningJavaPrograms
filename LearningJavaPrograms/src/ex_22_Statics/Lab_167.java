package ex_22_Statics;

public class Lab_167 {
    public static void main(String[] args) {
        Automation t1 = new Automation();
        System.out.println(Automation.driver);

        Automation t2 = new Automation();
        Automation t3 = new Automation();

        System.out.println(t2.driver);
        System.out.println(t3.driver);

    }
}


class Automation{
    static String driver = "Chrome";
}
package ex_30_Enum;

public class Lab_227 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Day.FRIDAY);
		 System.out.println(PROJECT_NAMES.google);
	}

}
enum Day{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}
enum PROJECT_NAMES{
    google, restassured, katalon, vwo
}
//class A{
//String[] days = {"Mon","Tue", "Wed", "Thurs","Fri","Sat","Sun"};
//}

package ex_18_polymorphism.methodoverloading;

public class webautomation {

	public static void main(String[] args) 
	{
		Browser b1=new Browser();
		b1.startbrowser();
		b1.startbrowser("chrome");
		

	}

}

class Browser
{
	void startbrowser()
	{
		System.out.println("starting default browser");
	}
	String startbrowser(String browser)
	{
		System.out.println("Starting browser " + browser);
		return browser;
	}


}

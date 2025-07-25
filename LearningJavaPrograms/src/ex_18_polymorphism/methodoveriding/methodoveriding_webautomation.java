package ex_18_polymorphism.methodoveriding;

public class methodoveriding_webautomation {

	public static void main(String[] args) {
		
		ChromeTC c1=new ChromeTC();
		c1.openBrowser();
		 CommonToAll commonToAll = new CommonToAll();
	        commonToAll.openBrowser();
	        
	        // Dynamic Dispatch
	        CommonToAll c2=new ChromeTC();
	        c2.openBrowser();
	        
	}

}
class CommonToAll{
    void openBrowser(){
        System.out.println("Starting IE Browser!!");
    }
}

class ChromeTC extends CommonToAll{

    @Override
    void openBrowser(){
        System.out.println("Starting Chrome Browser!!");
    }

}

class Firefox extends CommonToAll{
    @Override
    void openBrowser(){
        System.out.println("Firefox will start!");
    }
}

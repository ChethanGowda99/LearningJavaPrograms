package Task_july02;

public class Multilevel_Login_System {

	public static void main(String[] args) 
	{
		SuperAdmin s1=new SuperAdmin();
		s1.login();
		s1.accessAdminPanel();
		s1.shutdownSystem();
		

	}

}

class User
{
	void login()
	{
		System.out.println("user");
	}
	
}
class AdminUser extends User
{
	void accessAdminPanel()
	{
		System.out.println("AdminUser");
}
}
class SuperAdmin extends AdminUser
{
	void shutdownSystem()
	{
		System.out.println("SuperAdmin");
		
	}
}


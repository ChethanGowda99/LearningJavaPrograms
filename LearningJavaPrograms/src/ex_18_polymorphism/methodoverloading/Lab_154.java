package ex_18_polymorphism.methodoverloading;

public class Lab_154 {

	public static void main(String[] args) {
		
		        Home h1 = new Home();
		        h1.task(3);
		      
		    }
		}

		class Home{

		    void task(){
		        System.out.println("Task 1");
		    }
		    int task(int a){
		        System.out.println("Task 1");
		        return a;
		    }
		    boolean task(boolean a){
		        return false;
		    }



		}
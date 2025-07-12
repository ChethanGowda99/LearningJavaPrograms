package EX_17_Inheritance.singleinheritance;

public class Lab_146 
{
	 public static void main(String[] args)
	 {
	   Testcase1 t1 = new Testcase1();
       t1.runningTC1();
       Commontoall c1=new Testcase1();//dynamic dispatch
       c1.startBrowser();

   }
}
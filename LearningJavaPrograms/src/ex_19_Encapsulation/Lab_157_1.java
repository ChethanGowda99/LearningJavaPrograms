package ex_19_Encapsulation;

public class Lab_157_1 {

	public static void main(String[] args)
	{
		
		ICICBank balance=new ICICBank("user",100);
		long b=balance.getBal();
		 System.out.println(b);
	}
}

	
	class ICICBank 
	{
		private String name;
		private long bal;
		
		public ICICBank( String name,long bal)
		{
			this.name=name;
			this.bal=bal;
		
		}
		
		public String getName()
		{
			return name;
		}
		
	
		public void setName()
		{
			this.name=name;
	
		}
		public long getBal()
		{
			return bal;
		}
		
	
		public void setBal()
		{
			this.bal=bal;
	
		}
	}



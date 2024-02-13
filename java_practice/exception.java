/*
class handling1 {

	public static void main(String[] args) {
		try
		{
			int a[]=new int[5];
			a[5]=30/0;
		}
		catch(Exception e)
		{
			System.out.println("exception");
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Arithmetic exception");
		}
		
	}

}*/

class handling1 {
	
	void m1()throws Exception,ArithmeticException,NullPointerException
	{
		int a[]=new int[5];
			a[5]=30/0;
	}

	public static void main(String[] args) {
		handling1 hh=new handling1();
		try
		{
				hh.m1();

		}
		catch(Exception e)
		{
			System.out.println("exception");
		}
		
		
	}

}

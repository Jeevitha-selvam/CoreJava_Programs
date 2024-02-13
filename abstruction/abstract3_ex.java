abstract class a{
	static int a=8;
	
	a()
	{
		System.out.println(a);
	}
	
	abstract protected void m1();
	
	static void m2()
	{
		System.out.println("jeevi");
	}
	
	void m3()//we can use this method via super keyword in sub class
	{
		System.out.println("renu");
	}
}

class b extends a{
	b()
	{
		//super();
		super.m3();
	}
	
	public void m1()
	{
		System.out.println(a);//we can call the var value using this keyword becoz we are already called var value via the constructor used by super key
		System.out.println("hello");
	}
	static void m2()
	{
		System.out.println("jeevi");
		
	}
	public static void main(String []args)
	{
		b i=new b();
		i.m1();
		m2();
	}
}
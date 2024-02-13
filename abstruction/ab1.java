class a{
	private a(){//we can't use static or final keyword in constructor
		System.out.println("hii");
	}
	void m1()
	{
		System.out.println("hello");
	}
	public static void main(String []args)
	{
		a i=new a();
		i.m1();
	}
}
class a{
	a(){
	System.out.println("hi");
	}
	a(int a){
		System.out.println("welcome");
	}
}
class b extends a{
	b(){
		//super();
		super(5);
		System.out.println("salem");
	}
	b(String a){
		System.out.println("hello");
	}
	public static void main(String []args)
	{
		b obj=new b();
		b obj1=new b("jj");
	}
}
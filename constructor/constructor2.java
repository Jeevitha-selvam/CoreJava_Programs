class d{
	d(){
	System.out.println("d-no-args");
	}
	d(int a){
		System.out.println("welcome");
	}
}
class a extends d{
	a(){
	System.out.println("a-no-args");
	}
	a(int a){
		System.out.println("welcome");
	}
}
class b extends d{
	b(){
		//super();
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
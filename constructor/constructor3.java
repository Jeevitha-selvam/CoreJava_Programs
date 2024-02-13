class d{
	d(){
	this(5);
	System.out.println("d-no-args");
	}
	d(int a){
		System.out.println("d para");
	}
}
class a{
	a(){
	System.out.println("a-no-args");
	}
	a(int a){
		System.out.println("a para");
	}
}
class b extends a{
	b(){
		System.out.println("salem");
	}
	b(String a){
		super(5);
		System.out.println("hello");
	}
	public static void main(String []args)
	{
		b obj=new b();
		b obj1=new b("jj");
	}
}
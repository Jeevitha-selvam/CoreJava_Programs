class a{
	a(){
	}
	a(int f){
		System.out.println("single");
	}
}
class b extends a{
	b(){
		System.out.println("salem");
	}
	b(String b){
		super(5);
		System.out.println("hello");
	}
	public static void main(String []args)
	{
		b obj=new b();
		b obj1=new b("jj");
	}
}
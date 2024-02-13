
abstract class a{
	void m1()
		System.out.println("jww");
	
	public abstract void m();
}

class b extends a{
	public void m(){
		System.out.println("hii");
	}
	void m2(){
		super.m1();
	}
	public static void main(String []args)
	{
		b o=new b();
		o.m2();
	}
}
		
	
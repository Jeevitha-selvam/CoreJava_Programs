class a{
	void m1(){
		System.out.println("hi");
	}
}
class b extends a{
	void m2(){
		System.out.println("hello");
	}
}
class c extends a{
	void m3(){
		System.out.println("morning");
	}
}
class main{
	public static void main(String []args)
	{
		c d=new c();
		d.m1();
		d.m3();
		
	}
}
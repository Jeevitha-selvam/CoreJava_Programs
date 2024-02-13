//when we use this key in print statement that act as the obj only so the intialized var value only print

class b{
	int a,b;
	void m1(){
		System.out.println("m1 "+this.a);
		System.out.println("m1 "+this.b);
	}
	b(){
		System.out.println("Salem");
	}
	b(String h){
		this();
		System.out.println("hello");
	}
	public static void main(String []args)
	{
	
		b obj1=new b("gg");
		obj1.a=5;
		obj1.m1();
		
		
	}
}
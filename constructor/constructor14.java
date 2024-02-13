class a{
	a(){
	}
}

class b extends a{
	int i,g;
	public void m1(){
		System.out.println("m1 "+i);
		System.out.println("m1 "+this.g);
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
		obj1.i=5;
		obj1.m1();
		
		
	}
}
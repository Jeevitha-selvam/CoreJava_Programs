class b{
	b(){
		
		System.out.println("Salem");
	}
	b(String a){
		this("oo", 8);
		System.out.println("hello");
	}
	b(String a, int v){
		this(89);
		System.out.println("single");
	}
	b(int d)
	{
		this();
		System.out.println("single2222");
	}
	public static void main(String []args)
	{
	
		b obj1=new b("gg");
		
	}
}
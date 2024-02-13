class a{
	a(){
		System.out.println("moni");
	}
	a(int p)
	{
		System.out.println("uuu");
	}
}
class b extends a{
	int i,g;
	b(String k,String y){
		super(88);
		System.out.println("m1 "+this.i);
		System.out.println("m1 "+this.g);
	}
	b(){
		System.out.println("Salem");
	}
	b(char h){
		this(9);
		System.out.println("hello");
	}
	b(short t){
		this();
		System.out.println("bye");
	}
	public static void main(String []args)
	{
		b obj1=new b('h');
		obj1.i=5;
		b obj=new b("oo","l");
		
	}
}
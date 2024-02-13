//we doesn't call constructor within method
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
		this();
		System.out.println("hello");
	}
	public static void main(String []args)
	{
		b obj1=new b('h');
		obj1.i=5;
		b obj=new b("oo","l");
		
	}
}
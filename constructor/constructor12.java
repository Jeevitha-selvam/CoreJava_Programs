//we don't assign the variable value using only obj refer
//we want to use obj ref with var name
//if wew assign the obj value as null then we can't use the obj reference 
class b{
	int a;
	void m1(){
		System.out.println("m1 "+this.a);
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
		obj1=null;
		obj1.m1();
		
	}
}
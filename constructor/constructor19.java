class a{
	a(){}
	a(int i)
	{
		System.out.println("hii");
	}
	
}
class b extends a{
	
}
class c extends b{
	c(int i){
	
		System.out.println("hello");
	}
	public static void main(String []args)
	{
		c o=new c(8);
	}
}
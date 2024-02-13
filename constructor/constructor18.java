//if the derieved class doesn't have the no-arg constructor in sub class means it go to the super class
class a{
	a()
	{
		System.out.println("hii");
	}
	
}
class b extends a{
}
class c extends b{
	c(){
		System.out.println("hello");
	}
	public static void main(String []args)
	{
		c o=new c();
	}
}

class a
{

void m1()
{
	System.out.println("hii");
}
}
class b extends a
{
	int a=7;
	void m1()
{
	System.out.println("hello");
	
}
public static void main(String []args)
{
	a i=new b();
	i.m1();
	
	
}
}


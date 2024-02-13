package Java;

//


class c
{
	c()
	{   	                                                                     // defaultly having super keyword 
		this("java");
	 System.out.println("oii");
	}
	c( String s)
	{
		this(20,40,"machii");
		 System.out.println(s);
	}
	c(int f,  int s , String g)
	{
		System.out.println("hii "+  f +  s +  g);
	}
}

class b extends c
{
	b()
	{   	                                                                     // defaultly having super keyword 
		this("java");
	 System.out.println("oii");
	}
	b( String s)
	{
		this(20,40,"machii");
		 System.out.println(s);
	}
	b(int f,  int s , String g)
	{
		this(40,30);
		System.out.println("hii"+ f + s + g);
	}
	b(int a, int b)
	{
		System.out.println("hamma hamma ");
	}
}
public class Constractor  extends b
{
	Constractor()
	{
		this(10);
		System.out.println("jalliya iruka");
	}
	Constractor(int a)
	{
		this("love","hate");
		 System.out.println("neee");
		  System.out.println(a);
	}
	Constractor(String s, String d)
	{
		 System.out.println("unaku yanna pa"); 
	}
	public static void main(String[]args)
	{
		Constractor obj=new Constractor();
	}	
}


/*
public static void main(String[]args)
	{
		b obj=new b();
		
	}*/
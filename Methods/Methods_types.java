package Java;

class A{
	int a=30;
    static int b=15;

}	

class C {
	public int add(int a, int b){             // addition  return typ  with parameters
		int c=a+b;               
		return c;
	}
	
	public static int sub()                   // subtraction   return typ  without parameters
	{
		A obj=new A();              //IN var & sta var clss A
		int d=obj.a-A.b;     // In to In diff cls  obj create & cll with obj ref   st to In dir cl with ref
		System.out.println("sub = "+ d);
		return d;
	}
	
	public void multi(int d,int e)            //multiplication   non return typ  with parameters
	{
		int f=d*e;
		System.out.println("multi =" +  f);
	}
	
	public static void div()                     //division   non return typ  without parameters  
	{
		A obj1=new A();            //IN var & sta var clss A
		int g=obj1.a/A.b;     //In to In diff cls  obj create & cll with obj ref   st to In dir cl with ref
		System.out.println("div ="+  g);
	}
	
}

public class Methods{
	public static void main(String[]args)
	{
		C obj2=new C();              // In to sta    create obj                                
		System.out.println("add = "+obj2.add(10,15));    //parameters ku printing la value kudukanum 
		C.sub();                 
		obj2.multi(10,2);
		C.div();
	}
}

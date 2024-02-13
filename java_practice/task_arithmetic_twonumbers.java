class a{
	int a=5;
	static int b=5;
	}

class b{
	public int add(int c,int d){
		System.out.print("addition of two numbers ");
		return(c+d);
	}
	
	public static int sub(){
		a rr = new a();
		System.out.print("subraction of two numbers ");
		return(rr.a-a.b);
	}
	
	public void mul(int c,int d){
		System.out.print("multiplication of two numbers ");
		System.out.println(c*d);
	}
	
	public static void div(){
		a dd = new a();
		System.out.print("division of two numbers ");
		System.out.println(dd.a/a.b);
	}
}

class c{
	public static void main(String []args){
		b yy = new b();
		System.out.println(yy.add(10,5));
		
		System.out.println(b.sub());
		
		b xx = new b();
		xx.mul(10,2);
		
		b.div();
		System.out.println("addition of two methods ");
		int t=yy.add(10,5)+b.sub();
		System.out.println(" "+t);
	}
}
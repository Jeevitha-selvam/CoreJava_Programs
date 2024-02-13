class one{
	int a = 10;
	static int b = 20;
	
}

class two{
	
	public static int add (int c ,int d){
		
		
		int sm = c+d;
		System.out.println("the sum of a static method (add) with parameters is  ");
		return sm;
	}
	
	public static int  sub (){
		
		one obj = new one();
		
		int sb = one.b - obj.a;
		System.out.println( "the subraction  of a static method (sub) without parameters is   ");
		return sb;
	}
	
	public static void  multiply (int c , int d){
		 
		int mul = d*c;
		System.out.println( "the multiplication  of a static method (multiply) with parameters is   " + mul);

	}
	
	
	public static void  divide (){
		
		one obj = new one();
		int dvd = obj.b/obj.a;
		System.out.println( "the division  of a static method (divide) without parameters is   " + dvd);

	}
	
}
	

	
	class three{
	
	public static void main (String[]args){
		
           System.out.println (two.add(1,2));

           System.out.println (two.sub());

           two.multiply(10,2);
		
	   	   two.divide();
		
		
		
		
		
		//int adding = two.add( 1,2) + two.multiply( );
		int t = two.add(1,2)+two.sub();
		 System.out.println (t);
	}
	
	
	
}
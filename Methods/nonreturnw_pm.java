class A{
	public void h(int a,int b,String c){
		System.out.println(a+b);
		System.out.println(c);
	}
	
	public static void main(String []args){
		A obj=new A();
		obj.h(5,15,"hello");
	}
		
	}
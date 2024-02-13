//passed value in constructor is not within the child class so error exist

class a{ 
	a(){
		System.out.println("hii");
	}
	a(int g){
		System.out.println("single");
	}
}
class b extends a{
	b(String a){
		
		System.out.println("salem");
	}
	b(String a, int v){
		System.out.println("bye");
	}
	public static void main(String []args)
	{
	
		b obj1=new b(56);
		
	}
}
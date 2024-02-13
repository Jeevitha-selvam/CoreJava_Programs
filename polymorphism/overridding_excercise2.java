//if we are using static keyword in overriding means that changed as
class a{
	static void a(){
		System.out.println("hii");
	}
}
class b extends a{
	static void a(){
		System.out.println("helo");
	}
	public static void main(String []args){
		b obj=new b();
		obj.a();
	}
}

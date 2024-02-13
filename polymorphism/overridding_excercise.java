class a{
	void a(){
		System.out.println("hii");
	}
}
class b extends a{
	void a(){
		System.out.println("helo");
	}
	public static void main(String []args){
		b obj=new b();
		obj.a();
	}
}
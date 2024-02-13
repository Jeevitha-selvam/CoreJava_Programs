
//when the child parameter is not matched with the obj reference then that refer the parent parameter 
class a{
	void a(int a){
		System.out.println("hii");
	}
}
class b extends a{
	void a(byte b){
		System.out.println("helo");
	}
	public static void main(String []args){
		b obj=new b();
		obj.a(78);
	}
}


class a{
	void m1(){
		System.out.print("Its me");
	}
}
class b extends a{
	void m2(){
		System.out.println("J");
	}
}
class c extends b{
	void m3(){
		System.out.println("nice meeet u");
	}
}
class main{
	public static void main(String []args){
		c d=new c();
		d.m1();
		d.m2();
		d.m3();
	}
}
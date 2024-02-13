//abstract is not support for variables only for the classses and methods
abstract class a{
	//abstract a();
	//abstract int a;
	abstract static int m1(int u);
}
class b extends a{
	//a(){
	//	System.out.println("moni");
	//}
	//int a=9;
	static int m1(int y){
		System.out.println("hii");
		return 9;
	}
	public static void main(String[]args)
	{
		a j=new a();
		a i=new b();
		System.out.println(i.a);
		
		System.out.println(m1(9));
	}
}
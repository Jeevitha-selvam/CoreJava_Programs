abstract class a{
	abstract int m1(int u);
}
class b extends a{
	int m1(int y){
		System.out.println("hii");
		return 9;
	}
	public static void main(String[]args)
	{
		b i=new b();
		
		System.out.println(i.m1(9));
	}
}
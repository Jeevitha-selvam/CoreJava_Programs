import java.utill.java;
class a{
	static String s1="+",s2="-",s3="*",s4="/",s5="%";
	static int c;
	static int a;
	static String s;
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("first number");
		int a=sc.nextInt();
		m2();
		
	}
	static void m1()
	{
		Scanner sc=new Scanner(System.in);
		switch(s)
		{
			case s1:
			System.out.println("second number");
			int b=sc.nextInt();
			System.out.println(a+""+s+" "+b);
			int z=sc.nextInt();
			a=z;
			m2();
			case s2:
			System.out.println("second number");
			int d=sc.nextInt();
			System.out.println(a+""+s+" "+d);
			int y=sc.nextInt();
			a=y;
			case s3:
			System.out.println("second number");
			int e=sc.nextInt();
			System.out.println(a+""+s+" "+e);
			int x=sc.nextInt();
			a=x;
			case s4:
			System.out.println("second number");
			int f=sc.nextInt();
			System.out.println(a+""+s+" "+f);
			int w=sc.nextInt();
			a=w;
			case s5:
			System.out.println("second number");
			int g=sc.nextInt();
			System.out.println(a+""+s+" "+g);
			int v=sc.nextInt();
			a=v;
			default:
			System.out.println("Incorrect symbol");
			m1();
		}
		
	}
	static void m2()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("operator");
		String s=sc.nextLine();
		m1();
	}
}
	
	
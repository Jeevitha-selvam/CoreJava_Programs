//we can't change the return type in overloading that takes error
class a{
public static void m1(int q)
{
	System.out.println("hii");
}
public static int m1(int q)
{
	System.out.println("hello");
	return q;
}
public static void main(String[]args)
{
	System.out.println(m1(90));
}
}
//we may import same class or same package more than one time.but jvm will intrnally load that at once
import java.util.*;
import java.util.*;
class a
{
	static void m1(){
	{
		int i=9;
		System.out.println(i);
	}
	}
	public static void main(String[]args)
	{
		m1();
		int j=0;
		System.out.println(j);
	}
}
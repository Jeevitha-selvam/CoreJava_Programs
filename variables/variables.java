package Java;

public class variables {
	
		int b=20;       // Instance 
		static int s=40;  // Static
		
		public static void main (String [] args)
		{
			int c=5;
			System.out.println(c);     // Local variable
			System.out.println(s);       // same cls stc to stc
			System.out.println(B.j);     // diff cls stc to stc
			
			variables  n=new variables ();        //  same cls ins to stc crete object 
			System.out.println(n.b);
			
			B m=new B();
			System.out.println(m.d);   // diff cls ins to stc crete object 
			
		}	
		
	}
	class B
	{
		static int j=44;     // Instance 
		int d=55;            // Static
		
		
	}



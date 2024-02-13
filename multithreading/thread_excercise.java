package jeevi_practice;

class b extends Thread
{
	public void run()
	{
		System.out.println("hello");
	}
	
}

public class dd{
	public static void main(String[] args) {
		b aa=new b();

		aa.start();
		aa.start();

	}

}

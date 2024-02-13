package jeevs;

class customer
{
	int amount=10000;
	
	synchronized void withdraw(int amount)
	{
		System.out.println("going to withdraw");
		
		if(this.amount<amount)
		{
			System.out.println("less balance");
			try
			{
				wait();
			}
			catch(InterruptedException e)
			{
				System.out.println("caught");
			}
		}
		
		this.amount-=amount;
		System.out.println("withdraw completed");
	}
	
synchronized void deposit (int amount)
{
	System.out.println("going to deposit");
	this.amount+=amount;
	System.out.println("deposit completed");
	notify();
}
}

class one extends Thread
{
	static customer c=new customer();
	public void run()
	{
		c.withdraw(15000);
	}
}


class two extends Thread
{
	public void run()
	{
		one.c.deposit(10000);
	}
}
public class ITC {

	public static void main(String[] args) {
		one o=new one();
		two t=new two();
		o.start();
		t.start();

	}

}

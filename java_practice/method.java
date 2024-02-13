import java.util.*;
class a
{
	static int a;
	static int acc;
	static int pin;
	static int balance;
	
	public static void main(String []args)
	{
		m7();
		m1();
		m2();
	}
	
	public static void m7()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the account number");//creating account number
		acc=sc.nextInt();
		System.out.println("Set your PIN number");//pin number setting
		pin=sc.nextInt();
		System.out.println("Create your balance amount");//balance creation
		balance=sc.nextInt();
		System.out.println("Welcome to ATM banking!!!");
		System.out.println(" ");
		System.out.println("--Are you continue with cardless process--");
	}
	
	public static void m1()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("For continue cardless action enter 1");//condition for continue to atm process 
		a=sc.nextInt();
	}
	
	public static void m2()
	{
		if(a==1)
		{
			m3();
		}
		else
		{
			System.out.println("Enter correct number");
			m1();
		}
	}
	
	public static void m3()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the account number");
		int acc_no=sc.nextInt();
		if(acc_no==acc)
		{
			m4();
		}
		else
		{
			System.out.println("--Enter correct account number--");
		    m3();
		}
	}
	
	public static void m4()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your ATM pin number");
		int pin_no=sc.nextInt();
		if(pin_no==pin)
		{
			m5();
		}
		else
		{
			System.out.println("--Enter correct PIN number--");
			m4();
		}
	}
	
	public static void m5()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 for withdrawel");
		System.out.println("Enter 2 for deposit");
		System.out.println("Enter 3 for balance checking");
		int c=sc.nextInt();
		if(c==1)
		{
			System.out.println("Enter the amount");
			int d=sc.nextInt();
			if(d<=balance)
			{
				System.out.println("your transaction on processing please wait a minute");
				System.out.println("--Transaction Succesfull!!! Collect your amount--");
				balance-=d;
				m6();
			}
			else if(d>=balance)
			{
				System.out.println("This amount was not available at your account!!!");
				m6();
				
			}
			else if(d==0)
			{
				System.out.println("Please enter the amount");
				m5();
			}
		}
		else if(c==2)
		{
		System.out.println("Please put the notes in the box[amount in numbers]");
			int f=sc.nextInt();
			if(f!=0)
			{
				System.out.println("--Deposited Succesfully!!!--");
				System.out.println("you deposited amount is "+f);
				balance+=f;
				m6();
			}
			else
			{
				System.out.println("Please put the notes in box!!!");
				m5();
			}
							
		}
		else if(c==3)
		{
			System.out.println("Your available balance is "+balance);
			m6();
		}
		else
		{
			System.out.println("Enter the correct number");
			m5();
		}
	}
	
	public static void m6()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Do you want to continue..");
		System.out.println("for yes enter 1");
		System.out.println("for No enter 2");
		int r=sc.nextInt();
		if(r==1)
		{
			m5();
		}
		else if(r==2)
		{
			m8();
		}
		else
		{
			System.out.println("Enter correct number");
			m6();
		}
	}
	
	public static void m8()
	{
		System.out.println("Thank You For Banking With Us!!");

	}
	
}

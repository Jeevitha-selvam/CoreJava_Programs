import java.util.*;
class a
{
	static int a;
	static int acc;
	static int pin;
	static int balance;
	
	public static void main(String []args)
	{
		m1();
		m2();
	}
	
	public static void m1()
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
	
	public static void m2()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("For continue cardless action enter 1");//condition for continue to atm process 
		a=sc.nextInt();
		if(a==1)
		{
			m3();
		}
		else
		{
			System.out.println("!!Incorrect number!!");
			m2();
		}
	}
	
	public static void m3()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 1 for withdrawel (or)");
		System.out.print(" Enter 2 for deposit (or)");
		System.out.println(" Enter 3 for balance checking");
		int c=sc.nextInt();
		if(c==1)
		{
			m6();
		}
		else if(c==2)
		{
			m8();			
		}
		else if(c==3)
		{
			m10();
		}
		else
		{
			System.out.println("!!Incorrect number!!");
			m3();
		}
	}
	
	public static void m4()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount");
		int d=sc.nextInt();
		if(d==0)
		{
			System.out.println("!!Please enter the amount!!");
			m4();
		}
		else if(d<=balance)
		{
			System.out.println("your transaction on processing please wait a minute");
			System.out.println("--Transaction Succesfull!!! Collect your amount--");
			balance-=d;
			m13();
		}
		else if(d>=balance)
		{
			System.out.println("This amount was not available at your account!!!");
			System.out.println("!!Enter the correct amount!!");
			m4();
			
		}
		
	}
	
	public static void m5()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the deposit amount ");
		int f=sc.nextInt();
		if(f!=0)
		{
			System.out.println("--Deposited Succesfully!!!--");
			System.out.println("your deposited amount is "+f);
			balance+=f;
			m13();
		}
		else
		{
			System.out.println("!!you did not enter the deposited amount!!!");
			m5();
		}
				
	}
	
	public static void m6()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the account number");
		int acc_no=sc.nextInt();
		if(acc_no==acc)
		{
			m7();
		}
		else
		{
			System.out.println("--Incorrect account number--");
		    m6();
		}
	}
	
	public static void m7()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your ATM pin number");
		int pin_no=sc.nextInt();
		if(pin_no==pin)
		{
			m4();
		}
		else
		{
			System.out.println("--Incorrect PIN number--");
			m7();
		}
	}
	
	public static void m8()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the account number");
		int acc_no=sc.nextInt();
		if(acc_no==acc)
		{
			m9();
		}
		else
		{
			System.out.println("--Incorrect account number--");
		    m8();
		}
	}
	
	public static void m9()
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
			System.out.println("--Incorrect PIN number--");
			m9();
		}
	}
	
	public static void m10()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the account number");
		int acc_no=sc.nextInt();
		if(acc_no==acc)
		{
			m11();
		}
		else
		{
			System.out.println("--Incorrect account number--");
		    m10();
		}
	}
	
	public static void m11()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your ATM pin number");
		int pin_no=sc.nextInt();
		if(pin_no==pin)
		{
			m12();
		}
		else
		{
			System.out.println("--Incorrect PIN number--");
			m11();
		}
	}
	
	public static void m12()
	{
		System.out.println("Your available balance is "+balance);
		m13();
	}
	
	public static void m13()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Do you want to continue..");
		System.out.println("for yes enter 1");
		System.out.println("for No enter 2");
		int r=sc.nextInt();
		if(r==1)
		{
			m3();
		}
		else if(r==2)
		{
			m14();
		}
		else
		{
			System.out.println("--Incorrect number--");
			m13();
		}
	}
	
	public static void m14()
	{
		System.out.println("Thank You For Banking With Us!!");
	}
}

import java.util.*;
class a{
	static int id=12345;
	static String p="lib@123";
	static int b=0;
	static int count=0;
	public static void main(String []args)
	{
		System.out.println("Welcome to library management!!");
		m1();
	}
	
	public static void m1()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("For Student enter 1 or For Staff enter 2");
		int a=sc.nextInt();
		if(a==1)
		{
			System.out.println("Enter Student ROLL.NO: ");
			int roll_no=sc.nextInt();
			System.out.println("Enter the password: ");
			String pass_word=sc.next();
			m4();
			System.out.println("Thankyou for visiting our library!!");
		}
		else if(a==2)
		{
			m2();
		}
		else
		{
			System.out.println("--Incorrect number--");
			System.out.println("!!Enter correct number!!");
			m1();
		}
	}
	
	public static void m2()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Staff id.NO: ");
		int id_no=sc.nextInt();
		if(id_no==id)
			{
				m3();
			}
			else
			{
				System.out.println("Wrong id number!!");
				m2();
			}
	}
	
	public static void m3()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the password: ");
		String pw=sc.next();
		if(pw.equals(p))
		{
			++b;
			m4();
		}
		else
		{
			System.out.println("Wrong password!!");
			m3();
		}
	}
	
	public static void m4()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("--Select your deportment--");
		System.out.println("1-ECE 2-CSE 3-IT 4-EEE");
		int dept=sc.nextInt();
		if(dept==1)
		{
			System.out.println("Digital communication - 12");
			System.out.println("Antenna - 23");
			System.out.println("Wireless communication - 34");
			System.out.println("Electronics circuits - 45");
			System.out.println("Optical communication - 56");
			m5();
		}
		else if(dept==2)
		{
			System.out.println("Artificial Intelligence - 12");
			System.out.println("Database System - 23");
			System.out.println("Operation System - 34");
			System.out.println("Data Structures - 45");
			System.out.println("Principles of programming language - 56");
			m5();
		}
		else if(dept==3)
		{
			System.out.println("Computer science - 12");
			System.out.println("data science - 23");
			System.out.println("computer architecture - 34");
			System.out.println("Java programming - 45");
			System.out.println("sql - 56");
			m5();
		}
		else if(dept==4)
		{
			System.out.println("Engineering physics - 12");
			System.out.println("Electric machines(1) - 23");
			System.out.println("Electric machines(2) - 34");
			System.out.println("MPMC - 45");
			System.out.println("Digital electric circuits - 56");
			m5();
		}
		else
		{
			System.out.println("--Incorrect department number--");
			m4();
		}
	}
	
	public static void m5()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the book no for purchasing");
		int book_no=sc.nextInt();
		if(book_no==12||book_no==23||book_no==34||book_no==45||book_no==56)
		{
			System.out.println("Book number "+ book_no +" is purchased!!");
			if(b!=0)
			{
				count++;
				m6();
			}
		}
		else
		{
			System.out.println("--Invalid book number--");
			m5();
		}
	}
	
	public static void m6()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Do you want to continue?");
		System.out.println("For 'YES' enter 1 or For 'NO' enter 2");
		int enter=sc.nextInt();
		if(enter==1)
		{
			m4();			
		}
		else if(enter==2)
		{
			System.out.println("--You purchased ["+count+"] books--");
			System.out.println("Thankyou for visiting our library!!");
		}
		else
		{
			System.out.println("--Invalid nummber--");
			m6();
		}
	}
}
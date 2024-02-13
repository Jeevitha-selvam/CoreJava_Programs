import java.util.Scanner;
class A{
	public static void main(String []args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String:");
	char[] a = sc.nextLine().toCharArray();
	System.out.println("Reverse a String:");
	for(int i=a.length-1;i>=0;i--)
	{
	System.out.print(a[i]);
	}
	}
	}

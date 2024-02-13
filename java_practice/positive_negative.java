import java.util.*;
class R{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the total no.of values you are going to check:");
		int n = sc.nextInt();
		for(int i=1;i<n;i++)
		{
			System.out.print("Enter the value:");
		    int a = sc.nextInt();
		if(a>0)
		{
			System.out.println(a+" "+"is a positive number");
		}
		else if(a<0)
		{
			System.out.println(a+" "+"is a negative number");
		}
		else
		{
			System.out.println(a+" "+"it is zero");
		}
	    }
	}
}
			
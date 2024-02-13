import java.util.*;
class aa{
	public static void main(String []args){
		Scanner sc =  new Scanner(System.in);
		int count=0;
		System.out.println("Enter the number:");
		int a = sc.nextInt();
		while(a!=0)
		{
			a=a/10;
			count++;
		}
		System.out.print("The digits in a number is : "+count);
	}
}
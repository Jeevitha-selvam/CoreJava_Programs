import java.util.*;
class A{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the table number:");
		int table = sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.print(i+"*"+table+"=");
			System.out.println(i*table);
		}
	}
}
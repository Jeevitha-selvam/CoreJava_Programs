import java.util.*;
class s{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of times your going to enter the numbers for checking");
		int n = sc.nextInt();
		int c=0;
		int d=0;
		int b=0;
		int f;
		for(int i=0;i<=n;i++)
		{
			int a = sc.nextInt();
			if(a>b)
			{
				 c = a;
				 
			}
			else if(a<f)
			{
				 d = a;
			}
			b=c;
			
			f=d;
			
		
		}
		System.out.println(c+"largest number");
		System.out.println(d+"smallest number");
		}
		}
		
		
			
		
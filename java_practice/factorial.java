class a{
	public static void main(String []args){
		int a=5;
		int fact=1;
		
		for(int i=1;i<=5;i++)
		{
			fact=fact*i;
		}
		System.out.print(fact + " " + "is a factorial value of "+ " " + a);
		}
		}

class b
{
	public static void main( String[] args)
	{
	int a = 54327689;
	int total =0;
	 int rem;
	 while (a!=0){
		 rem = a% 10;
	 total= (rem+total*10);
	 a = a/10;
}
       System.out.print (total);
	   }
	   }

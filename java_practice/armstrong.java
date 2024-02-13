class a{
	public static void main(String []args){
		int a=258;
		int b=0;
		int rem=0;
		int org=a;
		while(a!=0)
		{
			rem=a%10;
			b=(rem*rem*rem)+b;
			a=a/10;
		}
		if(b==org)
		{
			System.out.print(org+" "+"is a armstrong number"+" ");
		}
		else
		{
			System.out.print(org+" "+"is not a armstrong number"+" ");
		}
		}
		}
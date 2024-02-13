class a{
	public static void main(String []args){
		int a = 342;
		int rem;
		int original=a;
		int b=0;
		while(a!=0)
		{
			rem = a%10;
			b = rem+(b*10);
			a=a/10;
		}
		if(b==original)
		{
			System.out.print(original+" "+"is a palindrome number");
		}
		else
		{
			System.out.print(original+" "+"is a palindrome number");
		}
		}
		}
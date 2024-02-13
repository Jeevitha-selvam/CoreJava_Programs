class a{
	public static void main(String []args){

		int a=22;
		int b=66;
		for(int i=a;i<=b;i++)//check 22 to 66
		{
			boolean c=true;
			for(int j=2;j<i;j++)//2 to 21
			{
				if(i%j==0)//check i/j value reminder == 0
				{
					c=false;
					break;
				}
			}
			if(c==true)
			{
				System.out.println(i);
			}
		}


	}
}
class a{
	public static void main(String []args){
		
		int a=22;
		int b=66;
		while(a<b)//check 22 to 66
		{
			boolean c=true;
			for(int i=2;i<a;i++)//2 to 21
			{
				if(a%i==0)//check i/j value reminder == 0 
				{
					c=false;
					break;
				}
			}
			if(c==true)
			{
				System.out.println(a);
			}
			a++;
		}
			
		
	}
}
class a{
	public static void main(String []args)
	{
		int am=657;
		int org=am;
		int result=0;
		while(am!=0)
		{
			int rem=am%10;
			result=(rem*rem*rem)+result;
			am=am/10;
		}
		if(result==org)
		{
			System.out.println(org+"is a armstrong value");
		}
		else
		{
			System.out.println(org+"is not a armstrong value");
		}
	}
}
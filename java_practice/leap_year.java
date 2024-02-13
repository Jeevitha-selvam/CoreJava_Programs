/*class aa{
	public static void main(String []args)
	{
	int leap_year = 2000;
	boolean b = false;
	if(((leap_year%4==0)&&(leap_year%100!=0))||(leap_year%400==0))
	{
	b=true;
	}
	System.out.print("b is a leap year");
	}
	}*/
class aa{
	public static void main(String []args)
	{
	int leap_year = 945;
	boolean b = false;
	if(leap_year%4==0)
	{
	if((leap_year%100==0)&&(leap_year%400==0))
	{
	b=true;
	System.out.print("b is a leap year");
	}
	}
	}
}
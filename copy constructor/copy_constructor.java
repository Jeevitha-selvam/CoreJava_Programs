package jeevs;

public class copy_constructor {
	int fid;
	String fname;
	int lid;
	String lname;
	
	copy_constructor(int id,String name)
	{
		fid=id;
		fname=name;
		System.out.println("first id "+fid);
		System.out.println("first name "+fname);
	}
	
	copy_constructor(copy_constructor c)
	{
		lid=c.fid;
		lname=c.fname;
		System.out.println("last id "+lid);
		System.out.println("last name "+lname);
	}
	public static void main(String[] args) {
		copy_constructor obj=new copy_constructor(35,"jeevitha");
		copy_constructor obj1=new copy_constructor(obj);
		obj.fname="janani";
		System.out.println("first name changed "+obj.fname);
		System.out.println("last name "+obj1.lname);
		

	}

}

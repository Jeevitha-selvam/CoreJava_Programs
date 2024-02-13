package jeevs;

class department implements Cloneable
{
	int depid;
	String name;
	department(int id,String n)
	{
		depid=id;
		name=n;
	}
	
	void display()
	{
		System.out.println("depatment id"+depid);
		System.out.println("name"+name);
	}
	
	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}

class Student implements Cloneable
{
	int id;
	String name;
	department dept;
	Student (int i,String n,department d)
	{
		id=i;
		name=n;
		dept=d;
	}
	
	void display()
	{
		System.out.println("id"+id);
		System.out.println("name"+name);
		dept.display();
	}
	
	protected Object clone() throws CloneNotSupportedException
	{
		Student s=(Student)super.clone();
		s.dept=(department)s.dept.clone();
		return s;
	}
}
public class object_cloning {

	public static void main(String[] args) throws CloneNotSupportedException {
		department dept=new department(21,"maths");
		Student std=new Student	(5,"jeevitha",dept);
		Student std1=(Student)std.clone();
		
		dept.name="biology";
		std.display();
		std1.display();
	}

}

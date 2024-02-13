package jeeviCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class demo_comparator implements Comparator<demo_comparator>{

	String name,dep;
	int id;
	char grade;
	
	demo_comparator(String name,int id,char grade,String dep)
	{
		this.name=name;
		this.id=id;
		this.grade=grade;
		this.dep=dep;
	}
	
//	@Override
//	public int compare(demo_comparator dd,demo_comparator dd1) {
//		if(dd.id>dd1.id)
//			return 1;
//		else if(dd.id==dd1.id)
//			return 0;
//		else
//			return -1;
//	}
//	
	@Override
	public int compare(demo_comparator dd,demo_comparator dd1) {
//		demo_comparator dd=(demo_comparator)o1;
//		demo_comparator dd1=(demo_comparator)o2;
		
//		if(dd.name.length()>dd1.name.length())
//			return 1;
//		else if(dd.name.length()<dd1.name.length())
//			return 0;
//		else
//			return -1;
		
//		if(dd.grade>dd1.grade)
//			return 1;
//		else if(dd.grade==dd1.grade)
//			return 0;
//		else
//			return -1;
		
//		return dd.name.length()-dd1.name.length();
		return dd.name.compareTo(dd1.name);
	}
	
	public String toString()
	{
		return "name "+name+" id "+id+" grade "+grade+" dep "+dep;
		
	}
	
	public static void main(String[] args) {
		demo_comparator ee=new demo_comparator("preethi",1,'C',"cse");
		ArrayList<demo_comparator> al=new ArrayList();
		al.add(new demo_comparator("moni",32,'B',"eee"));
		al.add(new demo_comparator("jee",24,'A',"ece"));
		al.add(new demo_comparator("dhana",9,'C',"cse"));
		al.add(ee);
		
		Collections.sort(al,ee);
		
		for(demo_comparator d:al)
		{
			System.out.println(d);
		}
	}
}

package jeevi_practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class comparable123 {
	 String name;
	 int age;
	 int roll;
	
	comparable123(String name,int age,int roll)
	{
		this.name=name;
		this.age=age;
		this.roll=roll;
	}

	public static void main(String[] args) {
		
		Comparable c=(comparable123 cc1)->{ 
	//	comparable123 cc=(comparable123)cc1;
			if(roll==cc1.roll)
				return 0;
			else if(roll>cc1.roll)
				return 1;
			else
				return -1;
		};
		
		
		ArrayList al=new ArrayList();
		al.add(new comparable123("jee",21,24));
		al.add(new comparable123("moni",19,34));
		
		Collections.sort(al);
		Iterator it1=al.iterator();
		while(it1.hasNext())
		{
			comparable123 ee=(comparable123)it1.next();
			System.out.println(ee.roll+":"+ee.name+":"+ee.age);
		}
	}
}
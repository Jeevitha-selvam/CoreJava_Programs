package jeevi_practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class comp123 {

	String name;
	 int age;
	 int roll;
	
	comp123(String name,int age,int roll)
	{
		this.name=name;
		this.age=age;
		this.roll=roll;
	}

	public static void main(String[] args) {
		
		Comparator c=(Object cc1,Object cc2)->{ 
		comp123 cc=(comp123)cc1;
		comp123 cs=(comp123)cc2;
			if(cc.roll==cs.roll)
				return 0;
			else if(cc.roll>cs.roll)
				return 1;
			else
				return -1;
		};
		
		
		ArrayList al=new ArrayList();
		al.add(new comp123("jee",21,24));
		al.add(new comp123("moni",19,34));
		
		Collections.sort(al);
		Iterator it1=al.iterator();
		while(it1.hasNext())
		{
			comp123 ee=(comp123)it1.next();
			System.out.println(ee.roll+":"+ee.name+":"+ee.age);
		}
	}
	

}

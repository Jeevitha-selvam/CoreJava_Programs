package jeeviCollection;

import java.util.ArrayList;

public class A {
	public static void main(String []args)
	{
		ArrayList al=new ArrayList();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		
		ArrayList al1=new ArrayList();
		al1.add(1);
		al1.add(2);
		al1.add(3);
		al1.add(6);
		al1.add(7);
		
	al.addAll(al1);
		System.out.println(al);
		al.retainAll(al1);
		System.out.println(al);
		
	}

}

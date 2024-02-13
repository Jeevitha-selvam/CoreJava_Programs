package jeeviCollection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class demohashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs=new HashSet();
		hs.add("hello");
		hs.add(67);
		hs.add("bye");
		hs.add("pa");
		hs.add(98);
		
		System.out.println("hs "+hs);
		System.out.println("hashcode "+hs.hashCode());
		
		/*
		String s1="hello";
		String s2="hello";
		s1=s1+"guys";
		System.out.println(s1==s2);
		*/
		
		Integer[] i1= {1,2,3,4,5,6,7};
		Integer[] i2= {6,7,8,9,10,1,2};
		
//		hs.addAll(Arrays.asList(i1));
		//union
		Set set=new HashSet();
		set.addAll(Arrays.asList(i1));
		System.out.println("set "+set);
		
		Set set1=new HashSet();
		set1.addAll(Arrays.asList(i2));
		System.out.println("set1 "+set1);
		
		HashSet hh1=new HashSet(set);
		hh1.addAll(set1);
		
		System.out.println("union "+hh1);
		
		//intersection
		HashSet hs1=new HashSet(set);
		hs1.addAll(set1);
		
		System.out.println("hs1 "+hs1);
		hs1.retainAll(set1);
		System.out.println("hs1 retainAll "+hs1);
		
		//difference of set1 and set2
		HashSet ht=new HashSet(set);
		ht.addAll(set1);
		ht.removeAll(set1);
		System.out.println("removed "+ht);
		
		//Linked set
		
		LinkedList <String> ll=new LinkedList();
		ll.add("yyy");
		ll.add("yyyuuu");
		ll.add("ppppp");
		System.out.println(ll.add("bye"));
		System.out.println("ll "+ll);
		
		//list or set changing as the array
		Object [] oo=ll.toArray();
		for(Object yy:oo)
		{
			System.out.println(yy);
		}
		ll.clear();
		System.out.println(ll);
		System.out.println(ll.contains("bye"));
		System.out.println(hs.isEmpty());
		
	}

}


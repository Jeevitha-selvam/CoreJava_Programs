package jeeviCollection;

import java.util.SortedSet;
import java.util.TreeSet;

public class demotreeset {

	public static void main(String[] args) {
		SortedSet set=new TreeSet();
		set.add("tree");
		set.add("fruit");
		set.add("juice");
		set.add("leef");
		System.out.println(set);
		
		for(Object oo:set)
		{
			System.out.print(oo+" ");
		}
		System.out.println();
		
		System.out.println("firstelement "+set.first());
		 
		System.out.println("lastelement "+set.last());
		
		
		System.out.println(set.headSet("tree"));
		System.out.println(set.tailSet("tree")); 
		
		TreeSet tt=new TreeSet();
		tt.add(5);
		tt.add(7);
		tt.add(4);
		tt.add(1);
		tt.add(3);
		
		System.out.println(tt);
		System.out.println(tt.tailSet(3, true));
		System.out.println(tt.headSet(4,false));
		System.out.println(tt.headSet(2,false)  );
		
		System.out.println("subset "+tt.subSet(3,true,5,true));
	}

}

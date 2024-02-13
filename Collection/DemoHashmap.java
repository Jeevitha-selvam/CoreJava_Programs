package jeeviCollection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DemoHashmap {

	public static void main(String[] args) {
		HashMap<String,Integer> hm=new HashMap();
		hm.put("jj",10);
		hm.put("uu",60);
		hm.put("tt",70);
		hm.put("rr",20);
		hm.put("uu",45);
	
		
		System.out.println("hm "+hm);
		
		//Set s=hm.keySet();
		System.out.println(hm.keySet());
		
		Collection c=hm.values();
		System.out.println(c);
		
		Set s1=hm.entrySet();
		System.out.println(s1);
		System.out.println("hello");
		
		Iterator i=s1.iterator();
		while(i.hasNext())
		{
			Map.Entry me=(Map.Entry)i.next();
			//System.out.println(i.next()+" ");
			System.out.println(me.getKey()+" "+"+++");
			System.out.println(me.getValue()+" "+"------");
			if(me.getKey().equals("rr"))
			{
				System.out.println(me.getValue());
				me.setValue(50);
				System.out.println(me);	
			}
			
			
		}
		
		System.out.println(s1);
		System.out.println();
		
		System.out.println("containskey "+hm.containsKey("tt"));
		System.out.println("containsvalue "+hm.containsValue(40));
		
		System.out.println("getordefault "+hm.getOrDefault("uu",s1));
		
		System.out.println("get "+hm.get("tt"));
		
		System.out.println("putifabsent "+hm.putIfAbsent("vim", 78));
		System.out.println(hm);
		
		System.out.println("replace "+hm.replace("ww", 87));
		System.out.println(hm);
		
		System.out.println("remove "+hm.remove("tt"));
		System.out.println(hm);
		
		
	}

}

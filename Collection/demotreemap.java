package jeeviCollection;

import java.util.Properties;
import java.util.TreeMap;

public class demotreemap {

	public static void main(String[] args) {
		TreeMap<String,Integer> tm=new TreeMap();
		tm.put("java", 10);
		tm.put("html", 8);
		tm.put("css", 8);
		tm.put("js", 2);
		
		System.out.println(tm);
		
		TreeMap<Integer,String> tm1=new TreeMap();
		tm1.put( 10,"java");
		tm1.put( 8,"html");
		tm1.put( 8,"css");
		tm1.put( 2,"js");
		
		System.out.println(tm1);
		
		System.out.println(tm1.ceilingKey(3));
		System.out.println(tm1.firstKey());
		System.out.println(tm1.floorKey(9));
		System.out.println("higher key "+tm1.higherKey(5));
		System.out.println("last key "+tm1.lastKey());
		System.out.println("lower key "+tm1.lowerKey(8));
		
		System.out.println("ceilingentry key "+tm1.ceilingEntry(8));
		System.out.println("decending keyset "+tm1.descendingKeySet());
		///////////////////////System.out.println("decending keymap "+tm1.descendingMap());
		//		System.out.println("headmap "+tm1.headMap(8));
		System.out.println("tailmap "+tm1.tailMap(2,false));
		
		//System.out.println("pollfirstentry "+tm1.pollFirstEntry());
		//System.out.println("pollLastentry "+tm1.pollLastEntry());
		System.out.println(tm1.values());
		
		System.out.println(tm1.subMap(2,true, 10,true));
		System.out.println(tm1);
		
		Properties pp=new Properties();
		
		
		
		
		
		

	}

}

package jeeviCollection;

import java.util.LinkedHashMap;

public class demolinkedhashmap {

	public static void main(String[] args) {
		LinkedHashMap lhm=new LinkedHashMap();
		lhm.put("java", true);
		lhm.put("html", true);
		lhm.put("css", true);
		lhm.put("js", false);
		
		System.out.println(lhm);
		System.out.println("containskey "+lhm.containsKey("spring"));
		System.out.println("containsvalues "+lhm.containsValue(true));
		
		LinkedHashMap lhm1=new LinkedHashMap();
		lhm1.put(1, "chennai");
		lhm1.put(2, "bangalore");
		lhm1.put(3, "coimbatore");
		lhm1.put(4, "hydrabad");
		
		System.out.println(lhm1);
		
		//lhm.putAll(lhm1);
		//System.out.println(lhm);
		
		
		

	}

}

package Collections;

import java.util.ArrayList;
import java.util.List;

public class Array_list_demo {

	public static void main(String[] args) {
		
		ArrayList a1=new ArrayList();
		
		System.out.println(a1.size());
		a1.add("dog");                             // add   element
		a1.add("cat");
		a1.add("lion");
		for(Object ob: a1)
		{
			System.out.println(ob);
		}
		
		System.out.println("-----"+ a1);
		a1.add(2,"cow");                                   // add indx and value
		System.out.println("--"+ a1);
		
		ArrayList a2=new ArrayList();
		a2.add("bone"); 
		a2.add(33); 
		a2.add('j');
		System.out.println("-----"+ a2);
		
		a1.addAll(a2);
		//System.out.println(a1.addAll(a2));
		System.out.println("==="+ a1);
		
		System.out.println(a1.contains("bone"));        //check paticular one            

        System.out.println(a1.containsAll(a2));          // check full ellement                  //    System.out.println();
		
       a1.remove(1);
       // System.out.println(a1.remove(1));                  // remove in index order
        
        System.out.println(a1.removeAll(a2));              // remove all elements
        System.out.println("***"+a1);
        
        System.out.println(a2.get(1));                    // get obj in that index   
        
        System.out.println(a2.indexOf('j'));                // find the position
		
//		for(Object oo: a1) {
//			
//			 System.out.println(oo+" ++ ");
//		}
	
		ArrayList a3=new ArrayList();
		a3.add(101);
		a3.add('c');
		a3.add("hello");
		a3.add(true);
		a3.add(102.33);
		
		 System.out.println("a3--"+a3);                   //
		 
		for(Object ob:a3) {
			try { 
				Integer in=(Integer)ob;                       //  use  genric execute only same data type
				 System.out.println(" " +in+" ");
			}
			catch(ClassCastException ee) { }	
		}
		
		System.out.println(a1);
		
		a1.addAll(a2);                              // add all elements
		System.out.println(a1);
		
		a1.retainAll(a2);                          //  remove 1 st obj element remaing store in first obj 
		System.out.println(a1);
		
		System.out.println("Size "+a1.size());          //find size of on obj 
		
		System.out.println(a1.subList(0, 2));
		
		List l=a1.subList(0, 2);                         // sublist( from indx ,to indx)
		System.out.println(l);
		
		Object[] ob=a3.toArray();                          // convert arraylist to obj
		
		for(int i=0;i<=ob.length-1;i++)
		{
		System.out.print(ob[i]+" ");
		System.out.println("  ");
		}
		
		
		System.out.println(a1);
		a1.set(1, "jeevi");                                  // set elem in particlr indx
		System.out.println(a1);
		System.out.println(a1.set(0, 2));
		System.out.println(a1);
		a1.add(false);
		System.out.println(a1);
		
		
		
		
		// User input
		
	}

}

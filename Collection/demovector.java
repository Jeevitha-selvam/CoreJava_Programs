package jeeviCollection;

import java.util.Vector;

public class demovector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector vv=new Vector();
		System.out.println("default capacity "+ vv.capacity());
		System.out.println("size "+vv.size());
		
		vv.add("jee");
		vv.add("uuuuu");
		vv.add(78);
		vv.add('c');
		vv.addElement("bye");
		vv.remove(2);
		System.out.println("vv "+vv);
		
		vv.insertElementAt(14,2);
		System.out.println("vv "+vv);
		System.out.println("elements at methods");
		
		Vector vv1=new Vector();
		vv1.add("jee");
		vv1.add("uuuuu");
		vv1.add(78);
		vv1.add('c');
		vv1.addElement("bye");
		System.out.println("vv1 "+vv1);
		
		vv.addAll(1,vv1);
		System.out.println("vv afteer add "+vv);
//		vv.removeAllElements();
		vv.removeElementAt(0);
		System.out.println(vv);
		
		for(Object ob: vv)
		{
			try
			{
				String ss=(String)ob;
				System.out.print(ss+" ");
			}
			catch(ClassCastException cce)
			{
				
			}
		}
		System.out.println();
		for(int i=0;i<vv.size();i++)
		{
			try
			{
				String ss=(String)vv.elementAt(i);
				System.out.print(ss+" ");
			}
			catch(ClassCastException cce)
			{
				
			}
		}
		System.out.println();
		
		
		Vector<String> rr=new Vector();
		rr.addElement("yyy");
		rr.addElement("ooooo");
		rr.addElement("ttttt");
		
		String[] ss=new String[rr.size()];
		rr.copyInto(ss);
		System.out.println(ss);
		for(Object pp:ss)
		{
			System.out.print(" "+pp);
		}
		
		
		
		
		
	}

}

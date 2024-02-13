package jeeviCollection;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class demoPriorityQueue {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq=new PriorityQueue();
		pq.add(50);
		pq.add(6);
		pq.offer(24);
		pq.add(3);
		pq.add(62);
		pq.offer(27);
		
		System.out.println(pq.element());
		System.out.println(pq);
		System.out.println("peek "+pq.peek());
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
		
		System.out.println(pq.remove(4));
		System.out.println(pq);
		
		//want thread safe choose this synchronized
		PriorityBlockingQueue pbq=new PriorityBlockingQueue();
		pbq.add(23);
		pbq.add(7);
		pbq.add(32);
		pbq.add(90);
		pbq.add(2);
		pbq.add(62);
		//pbq.add('j');
		
		System.out.println("pbq "+pbq);
		
		//ArrayList al=new ArrayList(pbq);
		ArrayList al=new ArrayList();
		System.out.println(al);
		//System.out.println("pbq drainTo "+pbq.drainTo(al, 4));
		//System.out.println(al);
		System.out.println("pbq drainTo "+pbq.drainTo(al));
		
		pbq.offer(89);
		pbq.add(78);
		System.out.println(pbq.offer(98));
		pbq.offerf
		System.out.println("al "+al);
		System.out.println("pbq "+pbq);
		
		try {
			System.out.println("take "+pbq.take());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("pbq "+pbq);
		pbq.put(66);
		System.out.println("put "+pbq);
		

	}

}

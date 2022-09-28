//wn we hv grp of elmnt which need preority processing thn we v go vth queue
//Q follow first in first out FIFO
// two end 1 is head and 1 is tail
//wn obj insert form the tail thn it's remove from the head,
//priorityQueue is clss under the queue interface
//PQ follows insertion oredr
//Duplicates data also allowed
//but the differenc b/t LL and PQ is 
//LL support heterogenious data and homogenious data
//PQ not support heterogenious data and support only homogenious data
//for adding the elements in Q : methods add(), offer()
//add()->if v add elmnt sucessfll it's giving TRUE if not it's giving exception
//offer()->if v add elmnt sucessfll it's giving TRUE if not it's giving false
//element()-> this method giving the head(1st) elemnt from the Q if there is no data in Q it's throws exception
//peek()-> this method giving the head(1st) elemnt from the Q if there is no data in Q it's giving the null
//remove()->this method 1st retriving the head (1st) elmnt and deleting it from the Q if there is no data in Q it's throws exception
//poll()->this method 1st retriving the head (1st) elmnt and deleting it from the Q if there is no data in Q it's giving  null

package pcs.practice.collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Queue_demo {
	public static void main(String[] args) {
		PriorityQueue q = new PriorityQueue<>();
		PriorityQueue qq = new PriorityQueue<>();
		q.add(12);
		q.add(15);
		q.add(14);
		q.add(14);
		q.add(110);
		q.offer(20);
		System.out.println(q);

		// System.out.println("head elmn from Q : " + qq.peek());
		// System.out.println("head elmn from Q : " + qq.element());

		// System.out.println("remv elmnt from Q : " + qq.poll());
		// System.out.println("remv elmnt from Q : " + qq.remove());
		// System.out.println(q);

		System.out.println();
		System.out.println("looping vth iterator : .....");
		Iterator i = q.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println();
		System.out.println("looping vth for-each : .....");
		for (Object i1 : q) {
			System.out.println(i1);
		}
	}
}

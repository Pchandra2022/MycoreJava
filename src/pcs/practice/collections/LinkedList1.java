// LL same like AL but
// LL, in it obj's stored randomly, every obj divided into 3 parts
// one obj called nodes, 
// a node == |null|obj|next obj adress| ,
// |previus obj adress|obj|next obj adress|
// when we need more no.of retrivells than we don't go with LL /go vth AL
// LL follows DeQueue interface methods also along with LIST and Collection Interfacess
// LL will be prefereds STACK and QUEUES
// LL have some more extra methods than AL
// stack follows FILO Queue follows FIFO
// AL follows only incertion order means one by one 
// but in LL it's incerting the obj's randomly but 
// each one holding the there adresess

// methods in LL =>:
//add(obj),add(index, obj),addAll(collection),remove(obj)
//remove(index),removeAll(collectin c),l.get(index),l.set(index, obj)
//for sorting Collection.sort() and .Shuffle()

//these all also followed by AL
// but What's new mthds in LL

//addFirst(obj)== the obj added at first plase in list
//addLast(obj)== the obj added at last place in list
//removeFirst(),removeLast(),getFirst(),getLast()
package pcs.practice.collections;

import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {

		// List l = new LinkedList();
		// LinkedList<String> l = new LinkedList<>();

		LinkedList l = new LinkedList();

		l.add(100);
		l.add(1);
		l.add(10);
		l.add(10);
		l.add(125);
		l.add(114);
		// l.add(null);

		// System.out.println(l);
		// System.out.println(l.size()); // 6
		// l.remove(3); // index pass // we con't removing with direct obj literal only
		// with index
		// System.out.println("after removing the obj : " + l);
		// // insert/ ading the obj in midle of list
		// l.add(3, "chintu");
		// System.out.println("after removing the obj : " + l);
		// // retriving the obj from list
		// System.out.println(l.get(3));
		// l.set(5, 'C'); // change value at perticular index
		// System.out.println(l);
		//
		// System.out.println(l.contains("java")); // false
		// System.out.println(l.contains('C')); // true
		// System.out.println(l.isEmpty()); // false
		// Collections.sort(l);
		// System.out.println(l);

		// // reading obj's from LL using for loop
		// for (int i = 0; i < l.size(); i++) {
		// System.out.println(l.get(i));
		// }
		//
		// System.out.println();
		// // reading obj's from LL using for-each loop
		// for (Object e : l) {
		// System.out.println(e);
		// }
		//
		// System.out.println();
		// // reading obj's from LL using iterator loop
		// Iterator i = l.iterator();
		// while (i.hasNext()) {
		// System.out.println(i.next());
		// }

		// LinkedList ll = new LinkedList<>();
		// ll.addAll(l);
		// System.out.println(ll);
		// ll.removeAll(l);
		// System.out.println(ll);
		//
		// Collections.sort(l);
		// System.out.println("after sorting : " + l);
		//
		// Collections.sort(l, Collections.reverseOrder());
		// System.out.println("after sorting : " + l);
		//
		// Collections.shuffle(l);
		// System.out.println();
		// System.out.println(l);

		/////////////////// LL specific methods /////////////
		System.out.println(l);
		l.addFirst(45);
		l.addFirst(1);
		l.addFirst(00);
		l.addLast(111);
		l.addLast(null);
		l.addLast(null);
		l.addLast(null);
		System.out.println(l);
		System.out.println("1st obj in  list : " + l.getFirst());
		System.out.println("lst obj in list : " + l.getLast());
		l.removeFirst();
		l.removeLast();
		System.out.println("after removing 1st nd lst obj's : " + l);
	}
}

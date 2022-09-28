//LHS sub clss to set Interface
//HS-> duplicates are not allowed
//LHS-> duplicates are not allowed
//HS-> insertion not allowed
//LHS-> insertion order is allowed
//HS-> data structure is hash table
//LHS-> it's also hash table along with LinkedList
//initial size 16 and load factor 0.75%

package pcs.practice.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHS {
	public static void main(String[] args) {
		HashSet ll = new HashSet<>();
		ll.add(100);
		ll.add(11);
		ll.add(22);
		ll.add(111);
		ll.add(89);
		System.out.println(ll);
		System.out.println();
		LinkedHashSet l = new LinkedHashSet<>();
		l.add(100);
		l.add(11);
		l.add(22);
		l.add(111);
		l.add(89);
		System.out.println(l);

	}
}

// wr v use set consept
// duplicate not allowed
// and, incertion order not allowed
// HS follows incert the obj's by the HashCode concept
// i.e., searching of the elmnt is very faast in HS
// there is no incertion order it's randomly added by hashcode support concept
// allowed the heterogenious data
// nulls also supported
// initially by default size of HS is 16 size
// it have  load factor and fill ratio
//// wn HS filled 16 size at that time wn it's reach 0.75% filled 
//// at that time it's created new HS and adding previous all HS data into new HS
//// these all done by Loadfactor
// 
package pcs.practice.collections;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {

		// HashSet h =new HashSet<>(); //default capacity 16 loadfactor is 0.75
//		 HashSet h =new HashSet<>(100); //initial capacity 100 loadfactor is 0.75
//		 HashSet hh = new HashSet<>(100, (float) 0.90); // initial capacity 100
		// loadfactor is
		// 0.90

		HashSet h = new HashSet<>(); // default capacity 16 loadfactor is 0.75

		h.add(1);
		h.add(2);
		h.add(3);
		h.add(4);
		h.add(5);
		// h.add('S');
		// h.add(true);
		// h.add(null);

		System.out.println("hashset 1 : " + h);
		// // insertion oreder not presered [null, chintu, S, 10.1, 11, true]
		// // removing obj
		// h.remove(11);
		// System.out.println(h);
		// // contains
		// System.out.println(h.contains(152)); // false
		// System.out.println(h.contains('S')); // true
		// System.out.println(h.isEmpty()); // false
		//// System.out.println(hh.isEmpty()); // true
		//
		// System.out.println();
		// for (Object e : h) {
		// System.out.println(e);
		// }
		//
		// System.out.println();
		// Iterator i = h.iterator();
		// while (i.hasNext()) {
		// System.out.println(i.next());
		// }
		//
		// System.out.println();
		// union, intersection, difference

		HashSet<Integer> hh = new HashSet<>();

		hh.add(3);
		hh.add(4);
		hh.add(5);

		System.out.println("hashset 2 : " + hh);
		// union
		h.addAll(hh);
		System.out.println("union : " + h);

		// intersection
		h.retainAll(hh);
		System.out.println("intersection : " + h);

		// difference
		h.removeAll(hh);
		System.out.println("difference : " + h);

		// subset
		System.out.println(h.containsAll(hh));
		// System.out.println("subset : " + hh);

	}
}

package pcs.practice.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args) {

		Integer arr[] = { 1, 5, 3, 6, 4, 8, 6, 22 };

		ArrayList a = new ArrayList(Arrays.asList(arr));
		a.add(100);
		a.add(20);
		a.add(150);
		a.add(23);
		a.add(80);

		// System.out.println(a);
		// System.out.println("no. of elements in list : " + a.size());
		// System.out.println("removing one obj : " + a.remove(true));
		// System.out.println("one elmnt added at 4th index : ");
		// a.add(4, "vinay");
		// System.out.println(a.get(1));
		// System.out.println("changing obj at 1st index : ");
		// a.set(1, "shekhar");
		// System.out.println("after replacing : " + a);
		// System.out.println(a.contains("shekhar"));// true
		// System.out.println(a.contains("chandu"));// false
		// System.out.println(a.isEmpty());// false

		System.out.println("reading elmnt using for loop......");
		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}
		System.out.println();
		System.out.println("reading elmnt using for-each loop......");
		for (Object o : a) {
			System.out.println(o);
		}
		System.out.println();
		System.out.println("reading elmnt using iterator loop......");

		Iterator it = a.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// ArrayList al = new ArrayList<>();
		//
		// al.addAll(a);
		// System.out.println();
		// System.out.println("elmnt in al : " + al);
		//
		// al.removeAll(al);
		// System.out.println("after removing all : " + al);

		System.out.println("elmnts in the a : " + a);
		Collections.sort(a);
		System.out.println("elmnts in the a after sorting : " + a);

		Collections.sort(a, Collections.reverseOrder());
		System.out.println(a);

		Collections.shuffle(a);
		System.out.println(a);

	}

}

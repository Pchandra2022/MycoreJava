// it's same like (key, value)
//underlying DS  of HAshtable--> internally based on hash-code
//HT->synchronised => at time one thrad can accesing methods from HT
//				   => other thread wait untila completing the 1st thread
//HM->non-synchronised=> at time multiple methods accessed in HM
//HT-> it's a thread safe
//HM-> it's not a thread safe
//HT-> performance is poor
//HM-> performance is faast than HT
//HT-> nulls can not accesed as a KEY and as a VALUE
//HM->one NULL key and multiple null VALUES
// both HM&HT follows hashtable structure=>internally it's based on hashcode
//initiall capacity 11, and load facto is 0.75
//
package pcs.practice.collections;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableDemo {
	public static void main(String[] args) {
		Hashtable<Integer, String> t = new Hashtable<>();
		// Hashtable hh = new Hashtable<>((int)InitialContext capacity,(float)fill
		// ratio/load factor);
		// Hashtable hh = new Hashtable<>(95,(float)0.95);

		t.put(101, "chandu");
		t.put(102, "jhon");
		t.put(103, "chintu");
		// t.put(null, "vvv");// nullpointerexception
		// t.put(105, null);// nullpointerexception

		System.out.println(t);// {103=chandu, 102=jhon, 101=chandu}

		System.out.println(t.get(101));// chandu

		System.out.println(t.remove(103));
		System.out.println(t);

		System.out.println(t.containsKey(101));// true
		System.out.println(t.containsKey(105));// false

		System.out.println(t.containsValue("chandu"));// true
		System.out.println(t.containsValue("chan"));// flse

		System.out.println(t.isEmpty());
		System.out.println(t.keySet());
		System.out.println(t.values());

		for (Integer k : t.keySet()) {
			System.out.println(k + " : " + t.get(k));
		}

		System.out.println();
		System.out.println();
		System.out.println();
		// Entry specific methods
		for (Map.Entry e : t.entrySet()) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}

		System.out.println();
		System.out.println("by iterating =================");
		Set s = t.entrySet();
		Iterator i = s.iterator();
		while (i.hasNext()) {
			Map.Entry e = (Entry) i.next();
			System.out.println(e.getKey() + " : " + e.getValue());
		}

	}
}

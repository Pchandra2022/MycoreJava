// Map is indipendent interface
// it's not under collection interface
// map having key&value called pair in one obj 
// grp of objcts need a key&value pairs thn v go vth map interface
// key is one obj and value is one obj
// in map duplicates key r not allowed 
// but duplicate values r allowed
// one pair is called one entry
// map interface is implemented by hashmap clss and hashtable
//HashMap===>-----
//underlying data structr is hash table
//incertion order is not presered
//duplicate key not allowed
//duplicate values allowed
// null key allowed only one time
//but null values are allowed multiple times
// more number of search operation needed thn v go vth HASHMAP
//for adding the obj's to map
//m.put(key,value), m.putAll(Map collection eg:m1)
//retriving values from MAP
//m.get(key)-> it's gives value of passed key
//m.remove(key)-> it's removing entire key and value from the MAP
//m.containsKey(key)->if yes it's gives TRUE if not FALSE
//m.containsVAlue(key)->if yes it's gives TRUE if not FALSE
//m.isEmpty()->if yes it's gives TRUE if not FALSE
//m.size()-> no.of elmnt in map
//m.clear()-> it's clearing the all the map
//related to entries im hashmap====>-----
// m.keySet()-> it's retriving the only key from the map
//m.values()->  it's retriving the only values from the map
//m.entrySet->  it's retriving the all pairs(key's and value) from the map
/*interface hashmap{
	interface Entry{
	// entry is sub interface of the hashmap
		// here we have some entry methods
	}
}*/

//e.getKey(key)->it's gives key from the HM
//e.getValue()->it's gives value from the HM
//e.setvalue(obj key parameter)-> changingthe value to passed key

package pcs.practice.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {
	public static void main(String[] args) {
		// HashMap m = new HashMap<>();
		HashMap<Integer, String> m = new HashMap<>();
		m.put(101, "chandu");
		m.put(102, "chintu");
		m.put(103, "sunnys");
		m.put(104, "lbk");
		m.put(105, "vinay");
		m.put(105, "lbk");

//		System.out.println(m);
//		System.out.println(m.size());
//
//		System.out.println(m.get(105));
//		// m.remove(105);
//		System.out.println(m);
//		System.out.println(m.containsKey(101));// true
//		System.out.println(m.containsKey(100));// false
//		System.out.println();
//		System.out.println(m.containsValue("chandu"));// true
//		System.out.println(m.containsValue("hhhh"));// false
//		System.out.println(m.isEmpty());// false
//		System.out.println(m.keySet());// returns all key's not duplicate[101, 102, 103, 104, 105]
//		System.out.println(m.values());// return all values vth duplicates also[chandu, chintu, sunnys, lbk, lbk]
//		System.out.println();
//		System.out.println(m.entrySet());// returns all the entries ffrom the map[101=chandu, 102=chintu, 103=sunnys,
//											// 104=lbk, 105=lbk]
//		System.out.println();
//		System.out.println(m.keySet());// it's retriving the only key's
		for (Object i : m.keySet()) {
			System.out.println(i);
		}

		System.out.println();
		System.out.println(m.values());// it's retriving the only values
		for (Object i : m.values()) {
			System.out.println(i);
		}

		/*
		 * System.out.println(); 
		 * System.out.println(m.entrySet()); 
		 * for (Object i : m.entrySet()) {
		 * System.out.println(i); 
		 * }
		 */

		System.out.println("55555555555555555555555");
		for (Object i : m.keySet()) {
			System.out.println(i + "  :  " + m.get(i));
		}

		// Entry methods
		System.out.println("===============---------------");
		for (Map.Entry e : m.entrySet()) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}
		System.out.println();
		System.out.println("iterating method");

		Set s = m.entrySet();
		Iterator i = s.iterator();
		while (i.hasNext()) {
			Map.Entry e = (Entry) i.next();
			System.out.println(e.getKey() + "  ====  " + e.getValue());
		}

	}
}

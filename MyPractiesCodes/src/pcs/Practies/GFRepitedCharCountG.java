package pcs.Practies;
// Java program for the above approach
import java.util.*;
import java.util.Map.Entry;
class GFRepitedCharCountG {

	public static void
	countDuplicateCharacters(String str)
	{

		Map<Character, Integer> map	= new HashMap<Character, Integer>();

		char[] charArray = str.toCharArray();

		for (char c : charArray) {

			if (map.containsKey(c)) {

				// If character is present
				// in map incrementing it's
				// count by 1
				map.put(c, map.get(c) + 1);
			}
			else {

				// If character is not present
				// in map putting this
				// character into map with
				// 1 as it's value.
				map.put(c, 1);
			}
		}

		// Traverse the HashMap, check
		// if the count of the character
		// is greater than 1 then print
		// the character and its frequency
		for (Entry<Character, Integer> entry :map.entrySet()) {

			if (entry.getValue() >= 1) {
				System.out.println(entry.getKey()
								+ " : "
								+ entry.getValue());
			}
		}
	}

	public static void
	main(String args[])
	{
		String str = "geeksforgeeks";

		countDuplicateCharacters(str);
	}
}

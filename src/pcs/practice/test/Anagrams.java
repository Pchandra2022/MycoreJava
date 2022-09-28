package pcs.practice.test;

import java.util.Set;
import java.util.TreeSet;

public class Anagrams {

	static Set<Character> str1L = new TreeSet<Character>();
	static Set<Character> str2L = new TreeSet<Character>();

	public static void testing(String str1, String str2) {
		for (int i = 0; i < str1.length(); i++) {
			str1L.add(str1.charAt(i));
		}
		for (int i = 0; i < str2.length(); i++) {
			str2L.add(str2.charAt(i));
		}

		if (str1L.equals(str2L)) {
			System.out.println("given string is anagram");
		} else {
			System.out.println("given string is not an anagram");
		}

//		System.out.println("str1l : " + str1L);
//		System.out.println("str2l : " + str2L);

	}

	public static void main(String[] args) {
		testing("silent", "lisnten");
	}
}

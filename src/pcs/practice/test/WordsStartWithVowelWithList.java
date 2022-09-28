package pcs.practice.test;

import java.util.ArrayList;
import java.util.List;

public class WordsStartWithVowelWithList {

	public static void main(String args[]) throws Exception {

		List<String> words = new ArrayList<String>();
		words.add("apple");
		words.add("or");
		words.add("swachith");
		words.add("or");
		words.add("sathish");
		words.add("Oxe");
		words.add("kiran");
		words.add("Oxe");
		words.add("umbrella");
		words.add("ion");
		words.add("eye");
		words.add("chandu");

		for (String str : words) {

//		for (int i = 0; i < words.size(); i++) {
//			char ch = words.get(i).charAt(0);
			char ch = str.charAt(0);
//			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
//					|| ch == 'O' || ch == 'U' || ch == ' ') {
				if (ch == 'i' || ch == ' ') {
				System.out.println(str);
			}

		}

	}
}
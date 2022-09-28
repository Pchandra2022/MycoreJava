package pcs.practice.test;

import java.util.ArrayList;
import java.util.List;

public class WordsStartWithVowelWithString {

	static List<String> v = new ArrayList<String>();
	static List<String> c = new ArrayList<String>();

	public static void fileToString(String str) throws Exception {
		String words[] = str.split(" ");
		for (int i = 0; i < words.length; i++) {
			char ch = words[i].charAt(0);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
					|| ch == 'O' || ch == 'U' || ch == ' ') {
//				if (ch == 'i' || ch == ' ') {
				v.add(words[i]);
//				System.out.println("started with vowels : "+words[i]);
			} else {
				c.add(words[i]);
//				System.out.println("started with cosonents : "+words[i]);
			}
		}
	}

	public static void main(String args[]) throws Exception {
		String str = "What gift would we give to children who are Orphaned or who have very little i've access to emotional and spiritual nurturing through whatever circumstances, whether orphaned through physical loss, ISn Emotional Deprivation Or cultural Abandonment";
		fileToString(str);
		System.out.println("started with vowels : " + v);
		System.out.println("\nstarted with consonents : " + c);
		System.out.println();
	}
}
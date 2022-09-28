package pcs.Practies;

import java.util.ArrayList;
import java.util.List;

public class DuplicateWordsRemove {
	public static String s="apple";
	
	static List<Character> str = new ArrayList<>();
	
	public static void main(String[] args) {
		
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < s.length(); j++) {
				if(s.charAt(i)==s.charAt(j)) {
					str.add(s.charAt(i));
				}else {
					System.out.println();
				}
			}
			
		}
		System.out.println(str);
		
		
		
	}
}

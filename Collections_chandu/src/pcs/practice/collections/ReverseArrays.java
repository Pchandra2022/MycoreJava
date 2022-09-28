package pcs.practice.collections;

import java.util.Arrays;

public class ReverseArrays {

	public static String[] reverseString(String[] words) {
		System.out.println("Actuall Arrays : " + Arrays.toString(words));
		String[] t = new String[words.length];

		for (int i = 0; i < words.length; i++) {
			t[i] = "";
			for (int j = words[i].length() - 1; j >= 0; j--) {
				t[i] += words[i].substring(j, j + 1);
			}
		}

		System.out.println("reversed arrays : " + Arrays.toString(t));
		return t;
	}

	public static void main(String[] args) {

		String[] t1 = { "Chandu", "nazeer", "paasha", "Shekhr", "sunnys" };
		ReverseArrays.reverseString(t1);
	}

}




















//	    //using loop
//	    for(int i=0;i<words.length;i++)
//	    {
////	         System.out.println(t[i]);
//	    }
//using Arrays Method
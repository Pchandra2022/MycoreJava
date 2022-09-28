package pcs.practice.test;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Anagramss {
		static String fs="";
		static String ss="";
	public static void testing(String str1, String str2) {
		char ch[]=str1.toCharArray();
		System.out.println("before sorting the str1: "+Arrays.toString(ch));
		Arrays.sort(ch);
		System.out.println("**Char Array After Sorting**");
	    for (char ch1: ch){
	    	System.out.print(ch1);
	    	fs+=String.valueOf(ch1)+" ";
	    }
		char chh[]=str2.toCharArray();
		System.out.println("\n"+"before sorting the str2: "+Arrays.toString(chh));
		Arrays.sort(chh);
		System.out.println("**Char Array After Sorting**");
	    for (char ch2: chh){
	    	System.out.print(ch2);
	    	ss+=String.valueOf(ch2)+" ";
	    }

		if (fs.equals(ss)) {
			System.out.println("\n"+"given string is anagram : "+fs+" == "+ss);
		} else {
			System.out.println("given string is not an anagram : "+fs+" != "+ss);
		}
	}

	public static void main(String[] args) {
		testing("silent", "listen");
	}
}

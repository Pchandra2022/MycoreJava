package pcs.practice.java8Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter_Demo1 {
	public static void main(String[] args) {

		/*
		 * ArrayList<Integer> numberList=new ArrayList<>();
		 * 
		 * numberList.add(10); numberList.add(15); numberList.add(20);
		 * numberList.add(25); numberList.add(30);
		 */

		List<Integer> nl = Arrays.asList(10, 15, 20, 25, 30, 35);

		List<Integer> evenNumbrList = new ArrayList<Integer>();

		/*
		 * for (int n : evenNumbrList) { //without streams if (n % 2 == 0) {
		 * evenNumbrList.add(n); } System.out.println(evenNumbrList);}
		 */

		// with streams

		evenNumbrList = nl.stream().filter(n -> n % 2 == 0).collect(Collectors.toList()); // doing process and adding
																							// into some other
																							// collection

		System.out.println(evenNumbrList + "\n");

		nl.stream().filter(n -> n % 2 == 0).forEach(n -> System.out.println(n)); // without adding into some
																					// other collection
		System.out.println();
		nl.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
	}
}

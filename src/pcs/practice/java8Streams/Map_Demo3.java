package pcs.practice.java8Streams;

import java.util.Arrays;
import java.util.List;

public class Map_Demo3 {
	public static void main(String[] args) {
		List<Integer> n = Arrays.asList(2, 3, 4, 5, 6, 1);
		List<Integer> nn = Arrays.asList();

		/*
		 * // before java 8 / without using streams for (int num : n) { //
		 * System.out.println(num*2); nn.add(num * 2); } System.out.println(nn);
		 */

		// using streams - map

		/*
		 * nn = n.stream().map(num -> num * 2).collect(Collectors.toList());
		 * System.out.println(nn);
		 */

		n.stream().map(num -> num * 2).forEach(num1 -> System.out.println(num1));
		System.out.println();
		n.stream().map(num -> num * 2).forEach(System.out::println);

	}
}

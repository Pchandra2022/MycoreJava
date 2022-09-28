package pcs.practice.java8Streams;

import java.util.Arrays;
import java.util.List;

public class Map_Demo2 {

	public static void main(String[] args) {

		List<String> vehicles = Arrays.asList("bus", "car", "flight", "train");

		/*
		 * // before java8/ without using streams for (String name : vehicles) {
		 * System.out.println(name.length()); }
		 */

		// using streams
		// vehicles.stream().map(m -> m.length()).forEach(len ->
		// System.out.println(len));

		vehicles.stream().map(m -> m.length()).forEach(System.out::println);

	}

}

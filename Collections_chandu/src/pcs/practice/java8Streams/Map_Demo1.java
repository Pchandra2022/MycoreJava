package pcs.practice.java8Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map_Demo1 {
	public static void main(String[] args) {
		List<String> vehicles = Arrays.asList("bus", "car", "flight", "train");

		List<String> vehiclesInUpperCase = new ArrayList<String>();

		// before java8/ without using streams
		/*
		 * for (String name : vehicles) { vehiclesInUpperCase.add(name.toUpperCase()); }
		 * System.out.println(vehiclesInUpperCase);
		 */

		vehiclesInUpperCase = vehicles.stream().map(name -> name.toUpperCase()).collect(Collectors.toList());
		System.out.println(vehiclesInUpperCase);

	}
}

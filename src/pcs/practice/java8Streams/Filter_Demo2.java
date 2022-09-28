package pcs.practice.java8Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter_Demo2 {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("chandrashekhar", "anil", "bupal", "vinay", "shekhar", "vini", "srinivas");

		List<String> longNames = new ArrayList<String>();

		longNames = names.stream().filter(str -> str.length() >= 5 && str.length() < 8).collect(Collectors.toList());
		System.out.println(longNames + "\n");

		names.stream().filter(str -> str.length() > 4 && str.length() < 8).forEach(str -> System.out.println(str));

		System.out.println();
		names.stream().filter(str -> str.length() > 6 && str.length() < 8).forEach(System.out::println);

	}
}

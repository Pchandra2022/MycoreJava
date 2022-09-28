package pcs.practice.java8Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter_Demo3 {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("cup", null, "forest", "books", "sky", null, "pens");

		List<String> results = words.stream().filter(n -> n != null).collect(Collectors.toList());
		System.out.println(results);
	}
}

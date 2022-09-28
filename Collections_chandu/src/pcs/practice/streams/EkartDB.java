package pcs.practice.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EkartDB {

	public static List<Costomer> getAll(){
		return Stream.of(
				new Costomer(101, "john", "john@gmail.com", Arrays.asList("777777777", "666666666")),
				new Costomer(102, "smith", "smith@gmail.com", Arrays.asList("99999999", "888888888")),
				new Costomer(103, "peter", "peter@gmail.com", Arrays.asList("5555555555", "4444444444")),
				new Costomer(104, "kely", "kely@gmail.com", Arrays.asList("3333333333", "2222222222"))
				).collect(Collectors.toList());
	}
	
}

package pcs.practice.test;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class RandomNumbers {
	
	public static void main(String[] args) {
		
	Random random = new Random();

	//1
	IntStream randStream = random.ints(5);
	List<Integer> i = random.ints(5).boxed().collect(Collectors.toList());
	randStream.forEach(System.out::println);
	System.out.println("Integers : "+i);

	System.out.println("\n==============");
	//2
	DoubleStream doubleStream = random.doubles(2);
	List<Double> j = random.doubles(1).boxed().collect(Collectors.toList());
	doubleStream.forEach(System.out::println);
	System.out.println("Doubles : "+j);

	System.out.println("\n==============");
	//collect to list
	LongStream longStreams = random.longs(5);
	List<Long> l = random.longs(5).boxed().collect(Collectors.toList());
	longStreams.forEach(System.out::println);
	System.out.println("Longs : "+l);
}
}

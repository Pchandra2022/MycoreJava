package pcs.practice.consumer.supplier;

import java.util.function.Consumer;

public class Consumer_Chaining {
	public static void main(String[] args) {
		Consumer<String> c1 = s -> System.out.println(s + "  " + "is white");
		Consumer<String> c2 = s -> System.out.println(s + "  " + "is having four legs");
		Consumer<String> c3 = s -> System.out.println(s + "  " + "is eating gross");

		// c1.accept("cow");
		// c2.accept("cow");
		// c3.accept("cow");

		c1.andThen(c2).andThen(c3).accept("cow");

		// or one more way
		System.out.println();
		Consumer<String> cc = c1.andThen(c2).andThen(c3);
		cc.accept("Cow");

	}
}

package pcs.practice.Predicate;

import java.util.function.Predicate;

// joining multiple predicate == and , or, negate
//p1 , p2 are two predicates
//and ==> p1 should true and p2 should true than total JOIN-AND will return TRUE
//or ==> p1, p2 at-least any one TRUE
//negate ==> p1 true than p2 false (or) p1 false than p2 true

//example
//p1 -- checks number is eaven
//p2 -- checks greater than 50

public class PredictDemo3 {

	public static void main(String[] args) {

		int a[] = { 5, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65 };

		Predicate<Integer> p1 = i -> i % 2 == 0;
		Predicate<Integer> p2 = i -> i > 30;

		// and
		System.out.println("following are numbers EVEN & Greater than 50....." + "\n");
		for (int n : a) {
			if (p1.and(p2).test(n)) { // if (p1.test(n) && p2.test(n))
				System.out.println(n + "\t");
			}
		}

		System.out.println();
		// or
		for (int n : a) {
			if (p1.or(p2).test(n)) { // if (p1.test(n) || p2.test(n))
				System.out.print(n + "\t");
			}
		}

		// neget
		System.out.println();
		// or
		for (int n : a) {
			if (p1.negate().test(n)) { // if (p1.test(n) && p2.test(n))
				System.out.print(n + "\t");
			}
		}

	}
}

package pcs.practice.Predicate;

import java.util.function.Predicate;

// Predicate ---> one parameter returns boolean values(true/false)
// when we use == use only if you have conditional checks in your programm...

public class PredictDemo1 {
	public static void main(String[] args) {

		// Ex : 1
		Predicate<Integer> p = i -> (i >= 10);
		System.out.println(p.test(20)); // test(value) single absrta
		System.out.println(p.test(10) + "\n"); // that 10 value taken by i and checkin the condition

		// Ex : 2 check the length of the given String is greater than 4 or not

		Predicate<String> s = ss -> (ss.length() > 4);
		System.out.println(s.test("pcs"));
		System.out.println(s.test("chandu") + "\n");

		// Ex : 3 print array elements whose size is > 4 from array
		String names[] = { "chandu", "anil", "raj", "vinay", "bupal", "pcs" };
		for (String name : names) {

			if (s.test(name)) { //
				System.out.println(name);
			}

			/*
			 * if (name.length()>4) { // 10 checks one by one System.out.println(name); }
			 */
		}

	}
}

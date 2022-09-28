package pcs.practice.test;
import java.util.Arrays;
import java.util.function.IntPredicate;
class RandomNumbersWithIntStreams1 {
public static void main(String[] args)
{
		int arr_sample1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
				11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

		// asDoubleStream()
		// It converts the original array to double
		System.out.println("Example of asDoubleStream(): ");
		Arrays.stream(arr_sample1)
			.asDoubleStream()
			.forEach(e->System.out.print(e + " "));

		// asLongStream()
		// It converts the original array to Long
		System.out.println("\nExample of asLongStream");
		Arrays.stream(arr_sample1)
			.asLongStream()
			.forEach(e->System.out.print(e + " "));

		int arr_sample2[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9,
			10, 23, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

		// anyMatch()
		// This method find whether the given predicate
		// is in the array or not
		System.out.println("\nExample of anyMatch");

		// Test whether any of the element in array is
		// divisible by 11 or not
		IntPredicate predicate = e->e % 11 == 0;
		System.out.println(Arrays.stream(arr_sample2)
							.anyMatch(predicate));

		// You can directly write the lambda expression
		// which computes to IntPredicate
		// Uncomment to test
		// System.out.println(Arrays.stream(arr)
		// .anyMatch(e -> e % 11 == 0));

		int arr_sample3[] = { 2, 4, 6, 8, 10 };
		int arr_sample4[] = { 1, 3, 5, 7, 11 };

		// allMatch()
		// This method finds whether the given predicate
		// matches the entire array or not
		System.out.println("Example of allMatch :");

		// Returns true as all the elements of arr_sample3
		// is even
		System.out.println(Arrays.stream(arr_sample3)
							.allMatch(e->e % 2 == 0));

		// Returns false as all the elements of arr_sammple4
		// is odd
		System.out.println(Arrays.stream(arr_sample4)
							.allMatch(e->e % 2 == 0));

		// noneMatch()
		System.out.println("Example of noneMatch");
		System.out.println(Arrays.stream(arr_sample4)
							.noneMatch(e->e % 2 == 0));
	}
}

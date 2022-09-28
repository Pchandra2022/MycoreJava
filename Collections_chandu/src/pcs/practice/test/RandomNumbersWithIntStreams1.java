package pcs.practice.test;
import java.util.Arrays;
class RandomNumbersWithIntStreams {
	public static void main(String[] args)
	{
		int arr_sample1[] = { 11, 2, 3, 42, 5, 6, 17, 8, 9,
			10, 11, 12, 13, 24, 55, 16, 47, 18, 19, 20 };
		System.out.println("These method returns Optional");

		// average()
		// This method returns a average of an array
		System.out.println("Example of average() : ");
		System.out.println((Arrays.stream(arr_sample1)
								.average()));

		// findAny()
		// It can return any value from the stream
		// Most of the time it returns the first value
		// but it is not assured it can return any value
		System.out.println("Example of findAny() : ");
		System.out.println(Arrays.stream(arr_sample1)
							.findAny());

		// findFirst()
		// It returns the first element of the stream
		System.out.println("Example of findFirst() :");
		System.out.println(Arrays.stream(arr_sample1)
							.findFirst());

		// max()
		// It returns the max element in an array
		System.out.println("Example of max() :");
		System.out.println(Arrays.stream(arr_sample1)
							.max());

		// min()
		// It returns the max element in an array
		System.out.println("Example of max() :");
		System.out.println(Arrays.stream(arr_sample1)
							.min());

		// reduce()
		// It reduces the array by certain operation
		// Here it performs addition of array elements
		System.out.println("Example of reduce() :");
		System.out.println(Arrays.stream(arr_sample1)
							.reduce((x, y)->x + y));

		// reduce() have another variation which we will
		// see in different example
	}
}

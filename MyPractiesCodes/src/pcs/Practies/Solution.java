package pcs.Practies;

import java.util.Scanner;

class Solution {

	static int M = 1000000;
	static int MOD = 1000000007;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt(); // k is no. of subsets
		int n = sc.nextInt(); // n is size of array
		int nh = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) // input for array elements
		{
			arr[i] = sc.nextInt();
		}

		int SumofPrimeDivisors[] = new int[1000001];

		for (int i = 2; i <= 1000000; ++i) {
			if (SumofPrimeDivisors[i] == 0) {
				for (int j = i; j <= 1000000; j += i)
					SumofPrimeDivisors[j] = (SumofPrimeDivisors[j] + i) % M;
			}
		}

		int totalsum = 0;

		for (int i = 0; i < n; i++) {
			totalsum = (totalsum + SumofPrimeDivisors[i]) % M;
		}
		System.out.println("total sum is : " + totalsum);
	}
}
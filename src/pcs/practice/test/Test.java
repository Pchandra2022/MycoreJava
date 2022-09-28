package pcs.practice.test;

//Avantika Maurya
//Find all the possible triplets from a given array whise sum is less or equal to 12.
//[1,6,2,8,5,6,2,8,4,7,1]


public class Test {

	boolean find3(int a[], int Asize, int sum) {
		for (int i = 0; i < Asize-2; i++) {
			for (int j = i+1; j < Asize-1; j++) {
				for (int K = j+1; K < Asize; K++) {
					if (a[i]+a[j]+a[K]==sum) {
						System.out.print(a[i]+","+a[j]+","+a[K]);
						return true;
					}
				}
			}
		}
		return false;
		
	}
	public static void main(String[] args) {
		Test t= new Test();
		System.out.println("Triplet is : ");
		int A[] = {1,6,2,8,5,6,2,8,4,7,1};
//		int A[] = {0, -1, 2, -3, 1};
		int sum = 12;
		int Asize=A.length;
		t.find3(A, Asize, sum);
	}

}

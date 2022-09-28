package pcs.practice.test;

import java.util.Scanner;

class check {

	static void pin() {
		Scanner sc = new Scanner(System.in); 
		System.out.println("enter your pin");

		int AtmPin = 1234;
		for (int i = 1; i <= 3; i++) {
			int a = sc.nextInt(); 
			if (a != AtmPin) {
				switch (i) {
				case 1:
					System.out.println("you have two chance left");
					break;
				case 2:
					System.out.println("you have one chance left");
					break;
				case 3:
					System.out.println("try after some time");
					break;
				}
			} else {
				System.out.println("welcome");
				break;
			}
		}
	}
}

public class Atm extends check {

	public static void main(String[] args) {
		System.out.println("hello");
		check.pin();
	}

}
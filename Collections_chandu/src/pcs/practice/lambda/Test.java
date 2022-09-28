package pcs.practice.lambda;

interface Cab {
	public void bookCab();
}

// class Ola implements Cab {
// public void bookCab() {
// System.out.println("Ola cab is booked...");
// }
// // ()->System.out.println("Ola cab is booked...");
// }

public class Test {
	public static void main(String[] args) {
		Cab o = () -> System.out.println("Ola cab is booked...");
		o.bookCab();
	}
}

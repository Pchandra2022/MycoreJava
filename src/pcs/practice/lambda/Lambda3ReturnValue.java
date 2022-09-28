package pcs.practice.lambda;

interface Cab1 {
	public String bookCab(String src, String destination);
}

// class Ola implements Cab1 {
//
// public String bookCab(String src, String destination) {
// System.out.println("Ola cab is booked from " + src + " to " + destination);
// return "price : 50 Rs/- ";
// }
//
// }

public class Lambda3ReturnValue {
	public static void main(String[] args) {
		Cab1 o = (src, destination) -> {
			System.out.println("Ola cab is booked from " + src + " to " + destination);
			return "price : 50 Rs/- ";
		};
		System.out.println(o.bookCab("kukat pally", "kphb"));
	}
}

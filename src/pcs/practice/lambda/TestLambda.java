package pcs.practice.lambda;

interface Cabb {
	public void bookCab(String src, String destination);
}

// class Ola implements Cabb {
// @Override
// public void bookCab(String src, String destination) {
// System.out.println("Ola cab is booked from " + src + " to " + destination);
// }
// }

public class TestLambda {
	public static void main(String[] args) {
		Cabb o = (String src, String destination) -> System.out
				.println("Ola cab is booked from " + src + " to " + destination);
		o.bookCab("kukatpally", "kphb");
	}
}

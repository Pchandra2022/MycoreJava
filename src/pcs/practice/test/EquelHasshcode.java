package pcs.practice.test;

public class EquelHasshcode {
	public static void main(String[] args) {
		String s1 = "chandu";
		String s2 = "chandu";
		String ss1 = new String("chandu");
		String ss2 = new String("chandu");
		
		if (ss1.equals(ss2)) {
			System.out.println("given condition true");
		}
//		if (ss1==ss2) {
//			System.out.println("LITERAL TRUE");
//		}
//		
//		
//		if (ss1.equals(ss2)) {
//			System.out.println("new true");
//		}
//		if (ss1==ss2) {
//			System.out.println(" NEW-TRUE");
//		}
		else {
			System.out.println("given condition is not true");
		}
	}
}

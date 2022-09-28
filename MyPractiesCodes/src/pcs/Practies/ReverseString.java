package pcs.Practies;

public class ReverseString {

//	static String s="chandu";
//	public static void main(String[] args) {
//		char ch[]=s.toCharArray();
//		
//		for (int i = ch.length-1; i >=0; i--) {
//			System.out.println(ch[i]);
//		}
//		
//	}
//	
//}
//
//class ReverseStringg {

	static String s="chandu";
	public static void main(String[] args) {
//		char ch[]=s.toCharArray();
		
		for (int i = s.length()-1; i >=0; i--) {
			System.out.print(s.charAt(i));
		}
		
	}
	
}

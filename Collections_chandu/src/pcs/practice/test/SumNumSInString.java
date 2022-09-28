package pcs.practice.test;

public class SumNumSInString {
	
	public static void main(String[] args) {
		
	int sum=0;
	String s = "jklmn489pjro635ops";
	
	for(int i=0; i<s.length(); i++) {
//	    char temp = s.charAt(i);
	    if (Character.isDigit(s.charAt(i))) {
	        int b = Integer.valueOf(String.valueOf(s.charAt(i)));
	        sum+=b;
	    }
	}
	System.out.println(sum);

}

}
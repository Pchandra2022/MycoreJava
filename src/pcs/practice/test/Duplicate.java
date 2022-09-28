package pcs.practice.test;

public class Duplicate {

	public static void main(String[] args) {

		String src = "java is java hi am Chandu, how are you ChANDu";

		char[] srcChar = src.toLowerCase().toCharArray();

		int len = srcChar.length;
//		boolean flag = false;
		char ch;

		// System.out.println("Length of the String is "+len1);
		// System.out.println("Length of the character array is "+len);

		int k = 0;

		for (int i = 0; i < len; i++) {
			// System.out.println("i-----> "+i + " and character is "+srcChar[i]);
			for (int j = 0; j < len; j++) {
				// System.out.println("j-----> "+j + " and character is "+srcChar[j]);
				if (srcChar[i] == srcChar[j]) {
					k++;
				}
			}
			if (k > 1) {
				if (srcChar[i] > 1) {
					System.out.println("This character " + srcChar[i] + " has repeated " + k + " time");
				} else {
					System.out.println("There are no characters repeated in the given string");
				}
			}
			k = 0;
		}
	}
}
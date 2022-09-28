package pcs.practice.test;

import java.io.File;
import java.util.Scanner;

public class WordsStartWithVowel {
   public static String fileToString(String filePath) throws Exception {
      Scanner sc = new Scanner(new File(filePath));
      StringBuffer sb = new StringBuffer();
      String input = new String();
      String arr[] = filePath.split(" ");
      
      for (int i = 0; i < arr.length; i++) {
    	  input=arr[i]+" ";
		sb.append(input);
	}
      
//      while (sc.hasNextLine()) {
//         input = sc.nextLine();
//         sb.append(input);
//      }
      return sb.toString();
   }
   public static void main(String args[]) throws Exception {
      String str = fileToString("D:story.txt");
      String words[] = str.split(" ");
      for(int i = 0; i < words.length-1; i++) {
         char ch = words[i].charAt(0);
         if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'|| ch == 'A'|| ch == 'E'|| ch == 'I' ||ch == 'O' ||ch == 'u'||ch == ' ') {
//        	 if(ch == 'w'||ch == ' ') {
            System.out.println(words[i]);
         }
      }
   }
}
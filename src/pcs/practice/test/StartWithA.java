package pcs.practice.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StartWithA {
   public static void main(String args[]) throws Exception {
      String str = "This is apple, ant, anat, akshay, ankush,this is amani from hyd";
      String regex = "\\ba\\w*\\b";
      Pattern p = Pattern.compile(regex);
      Matcher m = p.matcher(str);
      String word = null;
      System.out.println("The input string is: " + str);
      System.out.println("The Regex is: " + regex + "\r\n");
      System.out.println("The words that start with a in above string are:");
      while (m.find()) {
         word = m.group();
         System.out.println(word);
      }
//      if (word == null) {
//         System.out.println("There are no words that start with a");
//      }
   }
}
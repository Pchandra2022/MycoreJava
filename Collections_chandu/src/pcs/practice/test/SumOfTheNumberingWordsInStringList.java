package pcs.practice.test;

import java.util.ArrayList;
import java.util.List;

public class SumOfTheNumberingWordsInStringList {

	static int sum;
	
	public static void main(String args[]) throws Exception {

		ArrayList<String> words = new ArrayList<String>();
        words.add("10");
        words.add("chadu");
        words.add("10");
        words.add("sathish");
        words.add("10");
        words.add("kiran");
		words.add("20");
		words.add("swachith");
//		words.add("1");
//		words.add("1");
//		words.add("1");
//		words.add("1");
//		words.add("1");
//		words.add("10");
        int sum =0;
         for(String element:words){
             try {
//            	 int num = Integer.parseInt(String.valueOf(element)); 
               int num = Integer.valueOf(element); 
               sum += num;
               }
             catch (NumberFormatException nfe){
               System.out.println ("Element " + element + " in the array is not an integer");
             }
        }
        System.out.println("\n"+"The sum of the values of the String List is : "+sum);
		
	}
}
package pcs.practice.test;

import java.util.ArrayList;
import java.util.Scanner;

public class CalOfString {
	
	public static void main(String[] args) {
		CalOfString.Calculator("2+4/1-3*2");
	}

	
	public static String Calculator(String str) {
	    // will get all numbers and store it to `numberStr`
	    String numberStr[] = str.replaceAll("[+*/()-]+"," ").split(" ");
	    // will get all operators and store it to `operatorStr`
	    String operatorStr[] = str.replaceAll("[0-9()]+","").split("");

	    int total = Integer.parseInt(numberStr[0]);

	    for (int i=0; i<operatorStr.length; i++) {
	        switch (operatorStr[i]) {
	            case "+" :
	                total += Integer.parseInt(numberStr[i+1]);
	                break;
	            case "-" :
	                total -= Integer.parseInt(numberStr[i+1]);
	                break;
	            case "*" :
	                total *= Integer.parseInt(numberStr[i+1]);
	                break;
	            case "/" :
	                total /= Integer.parseInt(numberStr[i+1]);
	                break;
	        }

	        if(i+2 >= operatorStr.length) continue; // if meets the last operands already
	        numberStr[i+1] = String.valueOf(total);

	    }
	    System.out.println("fina result : "+String.valueOf(total));
	    return String.valueOf(total);
	}
	

}


















////	String str = "4+(5%6)*4-4";
//
//	public static int calC(String input) {
//
//		int len = input.length();
//		ArrayList list1 = new ArrayList();
//		ArrayList list2 = new ArrayList();
//		for (int i = 0; i < len; i++) {
//			if ((input.charAt(i) != '+') && (input.charAt(i) != '-')) {
//				// check if the number is double-digit
//				if ((i + 1 <= len - 1)) {
//					if ((input.charAt(i + 1) != '+') && (input.charAt(i + 1) != '-')) {
//						String temp = "";
//						temp = temp + input.charAt(i) + input.charAt(i + 1);
//						int tempToInt = Integer.parseInt(temp);
//						// adding the double digit number
//						list1.add(tempToInt);
//					}
//					// add single digit number
//					list1.add(input.charAt(i) - '0');
//				}
//			} else {
//				// adding the symbols
//				list2.add(input.charAt(i));
//			}
//		}
//		int result = 0;
//		result = result + (int) list1.get(0);
//		for (int t = 0; t < list2.size(); t++) {
//			char oper = (char) list2.get(t);
//			if (oper == '%') {
//				result = result % (int) list1.get(t + 1);
//			} else if (oper == '*') {
//				result = result * (int) list1.get(t + 1);
//			} else if (oper == '+') {
//				result = result + (int) list1.get(t + 1);
//			} else if (oper == '-') {
//				result = result - (int) list1.get(t + 1);
//			}
//		}
//		
//		System.out.println("sum of val : "+result);
//		return result;
//	}



















//	public static void main(String[] args) {
//	    ArrayList<Character> listOfOpertionsCharFORM = new ArrayList<>();
//	    ArrayList<Character> listOfNumbersCharFORM = new ArrayList<>();
//	    ArrayList<Integer> listOfNumbersINTEGERFORM = new ArrayList<>();
//
//
//	    int Total = 0;
//
//	    Scanner sc = new Scanner(System.in);
//	    String input;
//	    System.out.print("Please enter your math equation :");
//	    input = sc.nextLine();
//	    System.out.println("string is : " + input);
//	    separator();
//
//
//	    char[] convertAllToChar = input.toCharArray();
//
//	    for (char inputToChar : convertAllToChar) {
//	        System.out.println("convertAllToChar     " + inputToChar);
//	    }
//	    for (int i = 0; i < input.length(); i++) {
//
//	        if (convertAllToChar[i] == '+') {
//	            listOfOpertionsCharFORM.add(convertAllToChar[i]);
//	        }
//	        if (convertAllToChar[i] == '-') {
//	            listOfOpertionsCharFORM.add(convertAllToChar[i]);
//	        }
//	        if (convertAllToChar[i] == '*') {
//	            listOfOpertionsCharFORM.add(convertAllToChar[i]);
//	        }
//	        if (convertAllToChar[i] == '/') {
//	            listOfOpertionsCharFORM.add(convertAllToChar[i]);
//	        }
//	        if (Character.isDigit(convertAllToChar[i])) {
//	            listOfNumbersCharFORM.add(convertAllToChar[i]);
//	        }
//
//
//	    }
//	    separator();
//	    for (Character aa : listOfOpertionsCharFORM) {
//	        System.out.println("list Of Operations Char FORM     " + aa);
//	    }
//	    separator();
//	    for (Character aa : listOfNumbersCharFORM) {
//	        System.out.println("list Of Numbers Char FORM       " + aa);
//
//	    }
//	    separator();
//
//	    for (Character aa : listOfNumbersCharFORM) {
//	        if (aa == '0') listOfNumbersINTEGERFORM.add(0);
//	        if (aa == '1') listOfNumbersINTEGERFORM.add(1);
//	        if (aa == '2') listOfNumbersINTEGERFORM.add(2);
//	        if (aa == '3') listOfNumbersINTEGERFORM.add(3);
//	        if (aa == '4') listOfNumbersINTEGERFORM.add(4);
//	        if (aa == '5') listOfNumbersINTEGERFORM.add(5);
//	        if (aa == '6') listOfNumbersINTEGERFORM.add(6);
//	        if (aa == '7') listOfNumbersINTEGERFORM.add(7);
//	        if (aa == '8') listOfNumbersINTEGERFORM.add(8);
//	        if (aa == '9') listOfNumbersINTEGERFORM.add(9);
//
//	    }
//
//	    for (Integer aaa : listOfNumbersINTEGERFORM) {
//	        System.out.println("list Of Numbers INTEGER FORM       " + aaa);
//	    }
//
//
//	    separator();
//	    separator();
//	    separator();
//
//
//	    System.out.print(listOfNumbersINTEGERFORM);
//
//	    System.out.print(listOfOpertionsCharFORM);
//
//	    System.out.println();
//	    System.out.println();
//
//
//	    if (listOfNumbersINTEGERFORM.size() == (listOfOpertionsCharFORM.size() + 1)) {
//
//	        for (int i = 0; i < listOfOpertionsCharFORM.size(); i++) {
//	            System.out.println("i   :" + i);
//	            if (listOfOpertionsCharFORM.get(i) == '+') if (i == 0) {
//	                Total = Total + listOfNumbersINTEGERFORM.get(i) + listOfNumbersINTEGERFORM.get(i + 1);
//	                System.out.println("total   : " + Total);
//	                separatorShort();
//	            } else {
//	                Total = Total + listOfNumbersINTEGERFORM.get(i + 1);
//	                System.out.println("total   : " + Total);
//	                separatorShort();
//	            }
//	            if (listOfOpertionsCharFORM.get(i) == '-') if (i == 0) {
//	                Total = Total + listOfNumbersINTEGERFORM.get(i) - listOfNumbersINTEGERFORM.get(i + 1);
//	                System.out.println("total   : " + Total);
//	                separatorShort();
//	            } else {
//	                Total = Total - listOfNumbersINTEGERFORM.get(i + 1);
//	                System.out.println("total   : " + Total);
//	                separatorShort();
//	            }
//	            if (listOfOpertionsCharFORM.get(i) == '*') if (i == 0) {
//	                Total = Total + listOfNumbersINTEGERFORM.get(i) * listOfNumbersINTEGERFORM.get(i + 1);
//	                System.out.println("total   : " + Total);
//	                separatorShort();
//	            } else {
//	                Total = Total * listOfNumbersINTEGERFORM.get(i + 1);
//	                System.out.println("total   : " + Total);
//	                separatorShort();
//	            }
//	            if (listOfOpertionsCharFORM.get(i) == '/') if (i == 0) {
//	                Total = Total + listOfNumbersINTEGERFORM.get(i) / listOfNumbersINTEGERFORM.get(i + 1);
//	                System.out.println("total   : " + Total);
//	                separatorShort();
//	            } else {
//	                Total = Total / listOfNumbersINTEGERFORM.get(i + 1);
//	                System.out.println("total   : " + Total);
//	                separatorShort();
//	            }
//
//	        }
//
//	    } else {
//	        System.out.println("*********###############**********");
//	        System.out.println("** your input not correct input **");
//	        System.out.println("*********###############**********");
//
//	    }
//
//	    System.out.println("*** Final Answer *** :  " + Total);
//
//	}
//
//	public static void separator() {
//	    System.out.println("___________________________________");
//	}
//
//	public static void separatorShort() {
//	    System.out.println("_____________");
//	}
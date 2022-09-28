package pcs.practice.Arrays;

import java.util.Scanner;

public class Pattern {

	private static Scanner sc;
	
	public static void main(String[] args) {
		int xx=1;
		int xxx=1;		
		for (int i = 1; i <= xx; i++ )
		{
			for (int j = 1; j < i; j++ ) 
			{
				System.out.print(" ");
			}
			System.out.print(xxx + " ");
			for(int k = i; k < xx; k++) 
			{
				System.out.print(" ");
			}
			System.out.println();
			if(xxx<64)
			xx++;
			xxx=xxx*2;
		}
	}
}
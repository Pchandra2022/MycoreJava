package pcs.practice.test;

import java.util.Scanner;

public class BankAtmPinCheck {

	
	public static void main(String[] args) {
		
		
		int balance =3000;
		int deposite ;
		int withdraw;
		
		Scanner s=new Scanner(System.in);
		
		while(true)
		{
			System.out.println("wellcome to the state bank of india");
			
			System.out.println("press 1 to balance enquery");
			
			System.out.println("press 2 to balance deposite");
			
			System.out.println("press 3 to balance withdraw");
			
			System.out.println("press 4 to existe");
			
			int n=s.nextInt();
			
			switch(n)
			{
			case 1:
				System.out.println("available balance="+balance);
				
				break;
			case 2:
				
				System.out.println("enter the balance ");
				deposite =s.nextInt();
				
				balance=balance+deposite;
				
				System.out.println("your balance has been credited");
								
			
			    break;
			case 3:
				System.out.println("enter the amount");
				
				withdraw =s.nextInt();
				
				if(balance>=withdraw)
				{
					
					balance =balance-withdraw;
					
					System.out.println("please collect the amount");
					
				}
				else
				{
					System.out.println("unsufficient amount");
				}
				break;
			case 4:
			{
				System.out.println("exite="+0);
			}
			break;
			}
			
			
		}
		
	}
	
}

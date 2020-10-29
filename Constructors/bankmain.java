package Constructors;

import java.util.Scanner;

public class bankmain {

	public static void main(String[] args) {
		
		int amount;
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("enter the amount that deposited to your account");
		
		amount = kb.nextInt();
		
		if(amount>0)
		{
			bank addamount = new bank(amount);
		}
		else
		{
			bank noaddamount = new bank();
		}

	}

}

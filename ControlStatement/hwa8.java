package ControlStatement;

import java.util.Scanner;

public class hwa8 {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		int profit, loss;
		
		System.out.println("enter the cost price");
		int cp = kb.nextInt();
		
		System.out.println("enter the selling price");
		int sp = kb.nextInt();
		
		if(sp>cp)
		{
			profit = sp-cp;
			System.out.println("you have profit of rs: "+profit);
		}
		else
		{
			loss = cp-sp;
			System.out.println("you have loss of rs: "+loss);
		}

	}

}

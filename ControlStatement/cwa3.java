package ControlStatement;

import java.util.Scanner;

public class cwa3 {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		double bsal, gsal;
		
		System.out.println("enter your basic salary");
		bsal = kb.nextInt();
		
		if(bsal<=10000)
		{
			gsal = bsal + (0.2*bsal) + (0.8*bsal);
			System.out.println(gsal);
		}
		else if(bsal<=20000)
		{
			gsal = bsal + (0.25*bsal) + (0.9*bsal); 
			System.out.println(gsal);
		}
		else
		{
			gsal = bsal + (0.3*bsal) + (0.95*bsal);
			System.out.println(gsal);
		}
	}

}

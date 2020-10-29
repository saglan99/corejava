package ControlStatement;

import java.util.Scanner;

public class cwa4 {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		double bill;
		
		System.out.println("enter total unit");
		int unit = kb.nextInt();
		
		if(unit<=50)
		{
			bill = unit*0.5;
		}
		else if(unit<=150)
		{
			bill = (50*0.5)+(unit-50)*0.75;
		}
		else if(unit<=250)
		{
			bill = (50*0.5)+(100*0.75)+(unit-150)*1.2;
		}
		else
		{
			bill = (50*0.5)+(100*0.75)+(100*1.25)+(unit-250)*1.5;
		}
		
		bill = (bill*0.2)+bill;
		
		System.out.println("total bill is:"+bill);

	}

}

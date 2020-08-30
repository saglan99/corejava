package hefshine;

import java.util.Scanner;

public class simpleinterest {

	public static void main(String[] args) {
		
		float principalamount, rateperannum, time, simpleinterest;
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("enter the principal amount");
		principalamount = kb.nextFloat();
		
		System.out.println("enter the rate per annum");
		rateperannum = kb.nextFloat();
		
		System.out.println("enter the time in years");
		time = kb.nextFloat();
		
		kb.close();
		
		simpleinterest = (principalamount * rateperannum * time)/100;
		
		System.out.println("simple interest is : "+simpleinterest);
		
		

	}

}

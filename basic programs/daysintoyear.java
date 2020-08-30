package hefshine;

import java.util.Scanner;

public class daysintoyear {

	public static void main(String[] args) {
		
		
		int a, year, week, day;
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("enter the number of days");
		a = kb.nextInt();
		
		year = a/365;
		a = a % 365;
		System.out.println("no. of years: "+year);
		
		week = a / 7;
        a = a % 7;
		System.out.println("no. of week: "+week);
		
		day = a;
		System.out.println("no. of days:" +day);
	}

}

package Constructors;

import java.util.Scanner;

public class rectanglemain {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("enter the length");
		int length = kb.nextInt();
		
		System.out.println("enter the width");
		int width = kb.nextInt();
		
		rectangle r1 = new rectangle(length, width);
		
		rectangle r2 = new rectangle(2,length, width);
		
		
		

	}

}

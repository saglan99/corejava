package ControlStatement;

import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("enter a length");
		int l = kb.nextInt();
		
		System.out.println("enter a breath");
		int b = kb.nextInt();
		
		int area = l*b;
		System.out.println("Area is: "+area);
		
		

	}

}

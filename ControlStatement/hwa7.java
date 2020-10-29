package ControlStatement;

import java.util.Scanner;

public class hwa7 {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("enter the first side");
		int  a = kb.nextInt();
		
		System.out.println("enter the second side");
		int  b = kb.nextInt();
		
		System.out.println("enter the third side");
		int  c = kb.nextInt();
		
		if(a==b && b==c)
		{
			System.out.println("it is an equilateral triangle");
		}
		else if(a==b || b==c || c==a)
		{
			System.out.println("it is an isosceles triangle");
		}
		else
		{
			System.out.println("it is an scalene triangle");
		}

	}

}

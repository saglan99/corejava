package ControlStatement;

import java.util.Scanner;

public class hwa1 {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		int a,b,c;
		
		System.out.println("enter the first number");
		a = kb.nextInt();
		
		System.out.println("enter the second number");
		b = kb.nextInt();
		
		System.out.println("enter the third number");
		c = kb.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println("greater among three number is: "+a);
		}
		else if(b>a && b>c)
		{
			System.out.println("greater among three number is: "+b);
		}
		else
		{
			System.out.println("greater among three number is: "+c);
		}

	}

}

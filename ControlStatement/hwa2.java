package ControlStatement;

import java.util.Scanner;

public class hwa2 {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("enter the number");
		int num = kb.nextInt();
		
		if(num%2==0)
		{
			System.out.println(num+" is even number");
		}
		else
		{
			System.out.println(num+" is odd number");
		}

	}

}

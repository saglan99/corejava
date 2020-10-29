package ControlStatement;

import java.util.Scanner;

public class hwa4 {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("enter the first number");
		int num1 = kb.nextInt();
		
		System.out.println("enter the second number");
		int num2 = kb.nextInt();
		
		if(num1>num2)
		{
			System.out.println(num1+" is maximum number");
			System.out.println(num2+" is minimum number");
		}
		else
		{
			System.out.println(num2+" is maximum number");
			System.out.println(num1+" is minimum number");
		}

	}

}

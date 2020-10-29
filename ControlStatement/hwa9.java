package ControlStatement;

import java.util.Scanner;

public class hwa9 {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("enter the value of num1");
		int num1 = kb.nextInt();
		
		System.out.println("enter the value of num2");
		int num2 = kb.nextInt();
		
		System.out.println("enter 1 for addition");
		System.out.println("enter 2 for subtraction");
		System.out.println("enter 3 for multiplication");
		System.out.println("enter 4 for division");
		System.out.println("enter 5 for modulus");
		int a = kb.nextInt();
		
		switch(a)
		{
		case 1: System.out.println(num1+num2);
		break;
		
		case 2: System.out.println(num1-num2);
		break;
		
		case 3: System.out.println(num1*num2);
		break;
		
		case 4: System.out.println(num1/num2);
		break;
		
		case 5: System.out.println(num1%num2);
		break;
		
		default: System.out.println("enter the valid input");
		}

	}

}

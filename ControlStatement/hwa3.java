package ControlStatement;

import java.util.Scanner;

public class hwa3 {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("enter the number");
		int num = kb.nextInt();
		
		if(num>0)
		{
			System.out.println(num+" is positive number");
		}
		else if(num<0)
		{
			System.out.println(num+" is negative number");
		}
		else if(num==0)
		{
			System.out.println(num+" is zero");
		}
		else
		{
			System.out.println("enter valid input");
		}

	}

}

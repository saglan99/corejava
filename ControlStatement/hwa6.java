package ControlStatement;

import java.util.Scanner;

public class hwa6 {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("enter the character");
		char a = kb.next().charAt(0);
		
		if(a>=65 && a<=90)
		{
			System.out.println(a+" is an uppercase alphabet");
		}
		else if(a>=97 && a<=122)
		{
			System.out.println(a+" is an lowercase alphabet");
		}
		else
		{
			System.out.println("enetr valid input");
		}

	}

}

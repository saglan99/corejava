package ControlStatement;

import java.util.Scanner;

public class hwa5 {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("enter the character");
		char a = kb.next().charAt(0);
		
		if(a == 'A' || a == 'E' || a == 'I' || a == 'O' || a == 'U' || a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u')
		{
			System.out.println(a+" is a vowel");
		}
		else
		{
			System.out.println(a+" is a constant");
		}
		

	}

}

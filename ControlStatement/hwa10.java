package ControlStatement;

import java.util.Scanner;

public class hwa10 {

	public static void main(String[] args) {
		
		char something;
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("enter the character");
		something = kb.next().charAt(0);
		
		if (something >= 97 && something <= 122)
		{
			System.out.println(" => Given Alphabet "+something+" is Lowercase.");
		} 
		else if (something >= 65 && something <= 90){
			System.out.println(" => Given Alphabet "+something+" is Uppercase.");			
		}
		else
		{
			System.out.println(" => Entered Value "+something+" is Not Alphabet.");
		}
		

	}

}

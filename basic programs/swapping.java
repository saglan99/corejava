package hefshine;

import java.util.Scanner;

public class swapping {

	public static void main(String[] args) {
		
		int num1, num2, num3;
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("enter the num1");
		num1 = kb.nextInt();
		
		System.out.println("enter the num2");
		num2 = kb.nextInt();
		
		System.out.println("value of num1 " +num1);
		System.out.println("value of num2 " +num2);
		
		num3 = num1;
		num1 = num2;
		num2 = num3;
		
		System.out.println(num1);
		System.out.println(num2);
		
		

	}

}

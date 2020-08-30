package hefshine;

import java.util.Scanner;

public class sumofnum {

	public static void main(String[] args) {
		
		int num1, num2, result;
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("enter the value of num1");
		num1 = kb.nextInt();
		
		System.out.println("enter the value of num2");
		num2 = kb.nextInt();
		
		result = num1 + num2;
		
		System.out.println(result);
		
		

	}

}

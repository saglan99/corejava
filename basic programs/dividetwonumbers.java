package hefshine;

import java.util.Scanner;

public class dividetwonumbers {

	public static void main(String[] args) {
		
		float num1, num2, result;
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("enter the num1");
		num1 = kb.nextFloat();
		
		System.out.println("enter the num2");
		num2 = kb.nextFloat();
		
		result = num1/num2;
		
		System.out.println(result);

	}

}

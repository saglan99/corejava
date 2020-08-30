package hefshine;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		
float length, breath, area, perimeter;
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("enter the length");
		length = kb.nextFloat();
		
		System.out.println("enter the breath");
		breath = kb.nextFloat();
		
		kb.close();
		
		
		area = length * breath;
		
		perimeter = 2 * (length + breath);
		
		System.out.println("area of circle is :" +area);
		
		System.out.println("perimeter of circle is :" +perimeter);

	}

}

package hefshine;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		
		
		float r, pi=3.14f, area, perimeter;
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("enter the radius");
		r = kb.nextFloat();
		
		kb.close();
		
		
		area = pi * r * r;
		
		perimeter = 2 * pi * r;
		
		System.out.println("area of circle is :" +area);
		
		System.out.println("perimeter of circle is :" +perimeter);

	}

}

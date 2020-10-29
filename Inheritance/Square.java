package Inheritance;

import java.util.Scanner;

public class Square {
	
	int area, side;
	
	Square()
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("enter the side of square");
		side = kb.nextInt();
		area = side * side;
		System.out.println("Area of Square is : "+area);
	}
	

	
	

}

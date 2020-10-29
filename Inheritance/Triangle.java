package Inheritance;

import java.util.Scanner;

public class Triangle extends Rectangle{
	
	int side1, side2, side3;
	
	public Triangle() 
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("enter the side1 of triangle");
		side1 = kb.nextInt();
		
		System.out.println("enter the side2 of triangle");
		side2 = kb.nextInt();
		
		System.out.println("enter the side3 of triangle");
		side3 = kb.nextInt();
		
		area = (side1*side2*side3);
		System.out.println("Area of Triangle is : "+area);
	}
	


}

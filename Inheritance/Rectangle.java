package Inheritance;

import java.util.Scanner;

public class Rectangle extends Square{
	
	int area,l,b;
	
	Rectangle() {
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("enter the length of rectangle");
		l = kb.nextInt();
		
		System.out.println("enter the breath of rectangle");
		b = kb.nextInt();
		
		area = 2*(l+b);
		System.out.println("Area of Rectangle is : "+area);
	
	} 


}

package Constructors;

import java.util.Scanner;

public class vehiclemain {

	public static void main(String[] args) {
		
		String color;
		int wheelcount;
		int gearscount;
		
        Scanner kb = new Scanner(System.in);
		
		System.out.println("enter the color");
		color = kb.next();
		
		System.out.println("enter the wheels");
		wheelcount = kb.nextInt();
		
		System.out.println("enter the gears");
		gearscount = kb.nextInt();
		
		vehicle v1 = new vehicle(color, gearscount);

	}

}

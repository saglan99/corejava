package Constructors;

import java.util.Scanner;

public class circlemain {

	public static void main(String[] args) {
		
		float radius;
		
		Scanner kb = new Scanner(System.in);
		System.out.println("enter the radius of circle");
		radius = kb.nextFloat();
		
		circle obj = new circle();
		System.out.println(obj.circlearea(radius));
		System.out.println(obj.circlecircum(radius));
		
	}

}

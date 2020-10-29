package Inheritance;

import java.util.Scanner;

public class vehiclebikemain {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		Bike obj = new Bike();
		
		System.out.println("enter the vehicle name");
		obj.vname=kb.next();
		
		System.out.println("enter the vehicle model number");
		obj.modelno=kb.nextInt();
		
		System.out.println("enter the vehicle price");
		obj.vprice=kb.nextInt();
		
		System.out.println("enter the vehicle service station");
		obj.servicestation=kb.next();
		
		System.out.println("enter the discount % rate");
		obj.drate=kb.nextInt();
		
		obj.display();
		obj.discount(obj.vprice);

	}

}

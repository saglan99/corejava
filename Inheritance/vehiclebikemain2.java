package Inheritance;

import java.util.Scanner;

public class vehiclebikemain2 {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("enter the vehicle name");
		String name=kb.next();
		
		System.out.println("enter the vehicle model number");
		int modelno=kb.nextInt();
		
		System.out.println("enter the vehicle price");
		int price=kb.nextInt();
		
		System.out.println("enter the vehicle service station");
		String servicepoint=kb.next();
		
		System.out.println("enter the discount % rate");
		int drate=kb.nextInt();
		
		Bike2 obj = new Bike2(name,modelno,price,servicepoint,drate);

	}

}

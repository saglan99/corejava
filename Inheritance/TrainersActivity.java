package Inheritance;

import java.util.Scanner;

public class TrainersActivity {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the Employee Id:");
		long id = kb.nextLong();
		
		System.out.println("Enter the Employee Name:");
		String name = kb.next();
		
		System.out.println("Enter the Employee Address:");
		String address = kb.next();
		
		System.out.println("Enter the Employee Phone Number:");
		long phn = kb.nextLong();
		
		System.out.println("Enter the Employee Salary:");
		double salary = kb.nextDouble();
		
		Manager2 obj1 = new Manager2(id, name, address, phn, salary);
		
		Trainee2 obj2 = new Trainee2(id, name, address, phn, salary);

	}

}

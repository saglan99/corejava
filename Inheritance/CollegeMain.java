package Inheritance;

import java.util.Scanner;

public class CollegeMain {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the Department Name");
		String departmentname=kb.next();
		
		System.out.println("Enter the HOD Name");
		String hodname=kb.next();
		
		System.out.println("Enter the Member Name");
		String membername=kb.next();
		
		System.out.println("Enter the Member Qualification");
		String memberqualification=kb.next();
		
		Department obj = new Department(departmentname,hodname, membername,memberqualification);

	}

}

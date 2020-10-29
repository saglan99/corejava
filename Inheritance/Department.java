package Inheritance;

import java.util.Scanner;

public class Department extends Staffmember {
	
	String departmentname;
	String hodname;
	
	Department(String departmentname, String hodname, String membername, String memberqualification)
	{
		super(membername,memberqualification);
		this.departmentname=departmentname;
		this.hodname=hodname;
		departmentdetails();
	}
	
	void departmentdetails()
	{
		System.out.println("Department Name : "+departmentname);
		System.out.println("HOD Name : "+hodname);
	}

}

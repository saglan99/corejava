package Inheritance;

public class Employee2 {
	
	long employeeId;
	String employeeName;
	String employeeAddress;
	long employeephn;
	double basicSalary;
	double specialallowance = 250.80;
	double hra = 1000.50;
	double salary;
	double salarywithallow;
	

	Employee2(long id, String name, String address, long phn, double salary)
	{
		employeeId=id;
		employeeName=name;
		employeeAddress=address;
		employeephn=phn;
		basicSalary=salary;
		display();
		calculatesalary();
		employeetransport(10);
		
	}
	
	void display()
	{
		System.out.println("Employee Id : "+employeeId);
		System.out.println("Employee Name : "+employeeName);
		System.out.println("Employee Address : "+employeeAddress);
		System.out.println("Employee Phone Number : "+employeephn);
		System.out.println("Employee Basic Salary : "+basicSalary);
	}
	
	void calculatesalary()
	{
		salary= basicSalary+(basicSalary*specialallowance/100)+(basicSalary*hra/100);
		System.out.println("Final salary : "+salary);
	}
	
	void employeetransport(int a)
	{
		double salwithtransallow = (10*basicSalary)/100;
		System.out.println("Transport Allowance : "+salwithtransallow);
		salarywithallow = salary + salwithtransallow;
		System.out.println("Final Salary with Transport Allowance : " + salarywithallow);
	}
	
}

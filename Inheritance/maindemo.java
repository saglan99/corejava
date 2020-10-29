package Inheritance;

public class maindemo {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		
		System.out.println(emp.Sname);
		System.out.println(emp.Sage);
		System.out.println(emp.Sphonenumber);
		System.out.println(emp.Saddress);
		System.out.println(emp.Ssalary);
		System.out.println(emp.Workspecialization);
		
		Manager man = new Manager();
		
		System.out.println(man.Sname);
		System.out.println(man.Sage);
		System.out.println(man.Sphonenumber);
		System.out.println(man.Saddress);
		System.out.println(man.Ssalary);
		System.out.println(man.Department);
		

	}

}

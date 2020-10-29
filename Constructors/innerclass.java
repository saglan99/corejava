package Constructors;

public class innerclass {
	
	int rollno;
	String name;
	
	void print()
	{
		System.out.println(rollno +" "+name);
	}
	
	class Hefshine
	{
		int marks;
		
		void print2()
		{
			System.out.println(marks + " "+rollno);
		}
	}

}

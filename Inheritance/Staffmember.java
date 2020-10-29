package Inheritance;

public class Staffmember {
	
	String membername;
	String memberqualification;
	
	Staffmember(String membername, String memberqualification)
	{
		this.membername=membername;
		this.memberqualification=memberqualification;
		showstaffmemberdetails();
	}
	
	void showstaffmemberdetails()
	{
		System.out.println("Staff Member Name : "+membername);
		System.out.println("Member Qualification : "+memberqualification);
	}

}

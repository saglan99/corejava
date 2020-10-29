package Constructors;

public class bank {
	
	int amount=5000;
	
	bank()
	{
		amount=amount+0;
		System.out.println("no amount will be added to the bank");
		System.out.println("your account balance is: "+amount);
	}
	
	bank(int a)
	{
		amount=amount+a;
		System.out.println(a+" rupees added to your bank");
		System.out.println("your account balance is: "+amount);
	}

}

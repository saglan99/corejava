package Inheritance;

public class Bike extends Vehicle{
	
	int drate;
	
	void discount(int price)
	{
		price = price-(price*drate)/100;
		System.out.println("Final discounted price is :"+price);
	}

}

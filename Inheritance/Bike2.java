package Inheritance;

public class Bike2 extends Vehicle2{


	Bike2(String name, int modelno, int price, String servicepoint, int drate)
	{
		super(name,modelno,price,servicepoint);
		price = price-(price*drate)/100;
		System.out.println("Final discounted price is :"+price);
	
	}
	
}

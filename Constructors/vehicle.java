package Constructors;

public class vehicle {
	
	int gears;
	String color;
	
	vehicle(String color, int gears)
	{
		this();
		this.color = color;
		this.gears = gears;
		System.out.println("the color of the car is:"+color);
		System.out.println("the car has:"+gears+" gears");
	}
	
	vehicle()
	{
		System.out.println("CAR SPECIFICATION");
	}

}

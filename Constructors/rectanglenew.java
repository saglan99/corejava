package Constructors;

import java.util.Scanner;

public class rectanglenew {
	
	int length, breath, area;
	
	void calculate()
	{
		area = length*breath;
		System.out.println("the area of rectangle is: "+area);
	}
	
	rectanglenew()
	{
		calculate();
	}
	
	rectanglenew(int l, int b)
	{
		this.length=l;
		this.breath=b;
		calculate();
	}
	
	rectanglenew(int a)
	{
		this.length=a;
		this.breath=a;
		calculate();
	}

}

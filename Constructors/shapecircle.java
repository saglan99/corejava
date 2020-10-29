package Constructors;

public class shapecircle {
	
	float pi= 3.5f;
	float area;
	int r=8;
	
	shapecircle()
	{
		area = pi *r*r;
		System.out.println("Area of circle is "+area);
	}
	
	shapecircle(int r, float pi)
	{
		this.r=r;
		this.pi=pi;
		area = pi *r*r;
		System.out.println("Area of circle is "+area);
	}
	
	

}

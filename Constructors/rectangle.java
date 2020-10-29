package Constructors;

import java.util.Scanner;

public class rectangle {
	
	rectangle(int l, int w)
	{
		int area = l*w;
		System.out.println("area of rectangle is:"+area);
	}
	
	rectangle(int a, int l, int w)
	{
		int perimeter = a*(l+w);
		System.out.println("perimeter of rectangle is:"+perimeter);
	}

}

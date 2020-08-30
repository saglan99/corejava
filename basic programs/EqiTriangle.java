package hefshine;

import java.util.Scanner;

public class EqiTriangle {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
        System.out.println("Enter the side of the Triangle:");
        
        double a= kb.nextDouble();
        
        double  area=(Math.sqrt(3)/4)*(a*a);
        
        System.out.println("Area of Triangle is: " + area);  

	}

}

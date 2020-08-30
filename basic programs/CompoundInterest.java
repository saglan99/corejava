package hefshine;

import java.util.Scanner;

public class CompoundInterest {

	public static void main(String[] args) {
		
		float p, r, t;
		int n =12;
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("enter the principal amount : ");
        p = kb.nextFloat();
        
        System.out.println("enter the rate of interest : ");
        r = kb.nextFloat();
        
        System.out.println("enter the time : ");
        t = kb.nextFloat();
        
        kb.close();
        
        
        double ci = ( p * (Math.pow(1+(r/n), n*t)))-p;
        
        System.out.println("Compound Interest is : " +ci);
        
	}

}

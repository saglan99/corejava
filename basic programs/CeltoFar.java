package hefshine;

import java.util.Scanner;

public class CeltoFar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float fahrenheit, celsius;  
		
        Scanner kb = new Scanner(System.in);
        
        System.out.println("enter celsius");
        celsius = kb.nextFloat();
        
        kb.close();
        
        fahrenheit =((celsius*9)/5)+32;
        
        System.out.println("Temperature in Fahrenheit is: "+fahrenheit); 
        

	}

}

package hefshine;

public class Calculatorbasic {
	
	int a,b,c;

    void addition() {
  	  a=5;
  	  b=5;
  	  c=a+b;
  	  System.out.println("addition: "+c);
    }
    
    void subtraction() {
  	  a=5;
  	  b=5;
  	  c=a-b;
  	  System.out.println("addition: "+c);
    }
    
    void multiplication() {
  	  a=5;
  	  b=5;
  	  c=a*b;
  	  System.out.println("addition: "+c);
    }
    
    void division() {
  	  a=5;
  	  b=5;
  	  c=a/b;
  	  System.out.println("addition: "+c);
    }
    
    void remainder() {
    	  a=5;
    	  b=5;
    	  c=a%b;
    	  System.out.println("addition: "+c);
      }
	
	
	

	public static void main(String[] args) {
		
		Calculatorbasic obj = new Calculatorbasic();
		
	       obj.addition();
           obj.subtraction();
	       obj.multiplication();
           obj.division();
           obj.remainder();
		
		
		}

}

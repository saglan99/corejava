package hefshine;

import java.util.Scanner;

public class Result {
	
	public static void main(String[] args) {
		
		int eng, mat, sci, his, geo, total, percentage;
		
        Scanner kb = new Scanner(System.in);
		
		System.out.println("enter the marks of english");
		eng = kb.nextInt();
		
		System.out.println("enter the marks of mathematics");
		mat = kb.nextInt();
		
		System.out.println("enter the marks of science");
		sci = kb.nextInt();
		
		System.out.println("enter the marks of history");
		his = kb.nextInt();
		
		System.out.println("enter the marks of geography");
		geo = kb.nextInt();
		
		System.out.println("english : " +eng);
		System.out.println("mathematics : " +mat);
		System.out.println("science : " +sci);
		System.out.println("history : " +his);
		System.out.println("geography : " +geo);
		
		total = eng + mat + sci + his + geo;
		
		percentage = (total * 100) / 500;
				
		System.out.println("Total marks : " +total);
		
		System.out.println("Percentage : " +percentage);
		

	}

}

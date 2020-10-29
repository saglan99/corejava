package Constructors;

import java.util.Scanner;

public class test {
	
	int num;
	
	void print()
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("enter the number");
		num = kb.nextInt();
	}
	
	test()
	{
		print();
		
		//even and odd
		
		if(num%2==0)
		{
			System.out.println(num+" is a even number");
		}
		else
		{
			System.out.println(num+" is an odd number");
		}
		
		//factorial
		
		long fact=1;
		
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
			System.out.println(fact);
		}
		
		//sum of all digit
		
		int n,sum=0;
		
		while(num>0)
		{
			n=num%10;
			sum=sum+n;
			num=num/10;
		}
		
		System.out.println("sum of digit is: "+sum);
		
		
		
	}

}

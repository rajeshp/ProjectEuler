package com.rao.fractions;

import java.util.ArrayList;

public class Test {

	static int count=1;
	
	static ArrayList<Fraction> fract_list = new ArrayList<Fraction>();
	
	

	
	public static void main(String[] args)
	{
		
		Fraction objFraction =new Fraction();
		
		Fraction f1 = Fraction.ONE;
		Fraction f2 = new Fraction(1,2);
		
		f1.add(f2).printFraction();
		
		Test test = new Test();
		
		Fraction f = new Fraction(1,2);
		f = new Fraction(7,5);
		
		test.generateFractionsRecursively(f);
		
		//System.out.println(objFraction.LCM(3, 2));
		
	}
	
	
	public void generateFractionsRecursively(Fraction f)
	{
		
		if(count<100)
		{
			
			Fraction fnew = new Fraction(Fraction.ONE, new Fraction(Fraction.ONE, f).reciprocate());
			
			
			
			
			
			
			
			fract_list.add(fnew);
			count++;
			
			fnew.printFraction();
			
			generateFractionsRecursively(fnew);
		}
				
	}
	
	
	
}

package com.rao.bigfractions;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;



public class BigFractionsTest {

	/**
	 * @param args
	 */
static int count=1;
	
	static ArrayList<BigFraction> fract_list = new ArrayList<BigFraction>();
	static ArrayList<BigFraction> candidates = new ArrayList<BigFraction> ();
	

	
	public static void main(String[] args)
	{
		
		
		Date d1 = new Date();
		
		BigFraction objBigFraction =new BigFraction();
		
		BigFraction f1 = BigFraction.ONE;
		BigFraction f2 = new BigFraction(BigInteger.ONE, new BigInteger("2"));
		
		f1.add(f2).printBigFraction();
		
		BigFractionsTest test = new BigFractionsTest();
		
		BigFraction f = new BigFraction(BigInteger.ONE, new BigInteger("2"));
		
		f = new BigFraction(new BigInteger("7"), new BigInteger("5"));
		
		
		
		test.generateBigFractionsRecursively(f);
		
		Date d2 = new Date();
		
		
		
		
		System.out.println("Over...");
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		test.removeNonCandidates();
		
		System.out.println("No of such fractions: "+test.candidates.size());
		
		//System.out.println(objBigFraction.LCM(3, 2));
		
	}
	
	
	
	public void removeNonCandidates()
	{
		
		for (BigFraction b : fract_list) 
		{
			
			if(b.numerator.toString().length() > b.denomenator.toString().length())
				candidates.add(b);
			
			
		}
		
		
	}
	
	public void generateBigFractionsRecursively(BigFraction f)
	{
		
		if(count<1000)
		{
			
			BigFraction fnew = new BigFraction(BigFraction.ONE, new BigFraction(BigFraction.ONE, f).reciprocate());
			
			
			
			
			
			
			
			fract_list.add(fnew);
			count++;
			
			fnew.printBigFraction();
			
			generateBigFractionsRecursively(fnew);
		}
		
		
		
				
	}

}

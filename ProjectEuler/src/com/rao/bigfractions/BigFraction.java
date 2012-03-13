package com.rao.bigfractions;

import java.math.BigInteger;

import java.util.HashSet;

import com.rao.fractions.Fraction;





public class BigFraction 
{

	public BigInteger numerator;
	public BigInteger denomenator=BigInteger.ONE;
	
	
	
	 /** A fraction representing "1". */
	public static final BigFraction ONE = new BigFraction(BigInteger.ONE, BigInteger.ONE);
	public static final BigFraction TWO = new BigFraction(new BigInteger("2"), BigInteger.ONE);
	public static final BigFraction INFINITY = new BigFraction(BigInteger.ZERO, BigInteger.ONE);
	
	
	
	public BigFraction()
	{
		
	}
	
	public BigFraction(BigInteger a, BigInteger b)
	{
		numerator = a;
		denomenator = b;
		
		
	}
	
	public BigFraction(BigFraction f1, BigFraction f2)
	{
		
		BigFraction result = f1.add(f2);
		
		this.numerator = result.numerator;
		this.denomenator = result.denomenator;
		
		
	}
	
	
	
	
	
	public BigFraction add(BigFraction f)
	{
		BigInteger lcm=BigInteger.ZERO;
		
		
		if((!this.denomenator.equals(BigInteger.ZERO)) && (!f.denomenator.equals(BigInteger.ZERO)))
			lcm = BigLCM(this.denomenator, f.denomenator);
		else {
			return INFINITY;
		}
		
		
		
		BigInteger num = (this.numerator.multiply(lcm.divide(this.denomenator)) ).add(f.numerator.multiply(lcm.divide(f.denomenator))); 
		BigInteger denom = lcm;
		
		
		
		return new BigFraction(num,denom);
	}
	
	
	public BigFraction reciprocate()
	{
		//swap numerator and denominator
		
		numerator = numerator.add(denomenator);
		denomenator = numerator.subtract(denomenator);
		numerator = numerator.subtract(denomenator);
		
		return this;
	}
	
	
	public int LCM(int a, int b)
	{
		int max,min;
		
		if(a==1 || b==1)
			return (a==1)?  b:  a;
		
		if(a==b)
		return a;
		
		max = (a>b)? a : b;
		min = (a>b)? b : a;
		
		
		//generate multiples of min
		
		HashSet<Integer> hSet = new HashSet<Integer>();
		
		int i=1;
		
		while(i<100)
			{hSet.add(min*i);
			i++;
			}
		
		i=1;
		
		while(hSet.add(max*i))
		{
			i++;
		}
		
		
		int lcm = max * i;
		
		
		
		
		return lcm;
	}
	
	
	
	public BigInteger BigLCM(BigInteger a, BigInteger b)
	{
		BigInteger max,min;
		
		
		if(a.equals(BigInteger.ONE) || b.equals(BigInteger.ONE))
			return (a.equals(BigInteger.ONE))?  b:  a;
		
		if(a.equals(b))
		return a;
		
		
		max = a.max(b);
		min = a.min(b);
		
		
		
		
		//generate multiples of min
		
		HashSet<BigInteger> hSet = new HashSet<BigInteger>();
		
		int i=1;
		
		while(i<100)
			{hSet.add(min.multiply(new BigInteger(i+"")));
			i++;
			}
		
		i=1;
		
		while(hSet.add(min.multiply(new BigInteger(i+""))))
		{
			i++;
		}
		
		
		BigInteger lcm = max.multiply(new BigInteger(i+""));
		
		
		
		
		return lcm;
	}
	
	
	public void printBigFraction()
	{
		System.out.println(this.numerator + "/"+this.denomenator);
	}
	
}

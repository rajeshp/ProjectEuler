package com.rao.fractions;

import java.util.HashSet;

public class Fraction 
{

	int numerator;
	int denomenator=1;
	
	
	
	 /** A fraction representing "1". */
	public static final Fraction ONE = new Fraction(1, 1);
	public static final Fraction TWO = new Fraction(2, 1);
	public static final Fraction INFINITY = new Fraction(1, 0);
	
	public Fraction()
	{
		
	}
	
	public Fraction(int num, int denom)
	{
		numerator=num;
		denomenator=denom;
	}
	
	public Fraction(Fraction f1, Fraction f2)
	{
		
		Fraction result = f1.add(f2);
		
		this.numerator = result.numerator;
		this.denomenator = result.denomenator;
	
	}
	
	
	
	public Fraction add(Fraction f)
	{
		int lcm=0;
		if(this.denomenator!=0 && f.denomenator!=0)
		 lcm = LCM(this.denomenator, f.denomenator);
		else {
			return INFINITY;
		}
		
		int num = (this.numerator * (lcm/this.denomenator))+(f.numerator * (lcm/f.denomenator)); 
		int denom = lcm;
		
		
		return new Fraction(num,denom);
	}
	
	
	public Fraction reciprocate()
	{
		//swap numerator and denominator
		
		numerator = numerator+denomenator;
		denomenator = numerator - denomenator;
		numerator = numerator-denomenator;
		
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
	
	
	
	public void printFraction()
	{
		System.out.println(this.numerator + "/"+this.denomenator);
	}
	
}

package com.rao.Integer;

import java.math.BigInteger;
import java.util.*;

public class BigPrimes 
{ int limit = 100000000;
ArrayList<BigInteger> primeArrayList ;

public BigPrimes()
{
	primeArrayList = new ArrayList<BigInteger>();
		
}
	
public void generatePrimes(int lim)
{
	BigInteger[] bigs = new BigInteger[limit];
	bigs[0]= new BigInteger("2");
	
	for(int i=1;i<limit;i++)
	{
		bigs[i]= bigs[0].add(BigInteger.ONE);
				
	}
	
	
	
	
}

	
	
}

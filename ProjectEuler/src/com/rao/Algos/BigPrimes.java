package com.rao.Algos;

import java.awt.Image;
import java.math.BigInteger;
import java.util.ArrayList;

public class BigPrimes {
	
	ArrayList bigPrimes = new ArrayList() ;
	
	int[] temp ;
	
	//generate Big Prime no.s till 10^12
	
	public void generateBigPrimes()
	{
	BigInteger seed= BigInteger.ONE;
	BigInteger limit = BigInteger.TEN;
	 limit.pow(12);
	 
	 
	 
	 int lim=1000000;
	 
	temp= new int[lim];	
	
	for(int i=2;i<lim;i++)
	{
	temp[i]= i	;
	}
	
	int i=0;
	
	
	
	}
	
	
	public static void main(String[] args)
	{
		BigPrimes obj = new BigPrimes();
		
		obj.generateBigPrimes();
		
		System.out.println("done...");
		
	}

}

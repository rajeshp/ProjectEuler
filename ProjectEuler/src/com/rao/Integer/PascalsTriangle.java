package com.rao.Integer;

import java.math.BigInteger;

import javax.naming.BinaryRefAddr;

public class PascalsTriangle {

	public static String generateNthRowString(int n)
	{
		if(n==1)
			return "1";
		if(n==2)
			return "11";
		
		String prevRow =generateNthRowString(n-1);
		
		StringBuilder sBuilder = new StringBuilder();
		sBuilder.append("1");
		for(int i=0;i<prevRow.length()-1;i++)
		{
	
			
		int res= Integer.parseInt(""+prevRow.charAt(i)) +Integer.parseInt(""+prevRow.charAt(i+1)) ;
		sBuilder.append(res);
		}
		sBuilder.append("1");
		
		
		
		return sBuilder.toString();
	}
	

	public static int[] generateNthRow(int n)
	{
		if(n==1)
			return new int[]{1};
		if(n==2)
			return new int[]{1,1};
	
	int[] prevRow = generateNthRow(n-1);
	
	int[] newRow = new int[prevRow.length+1]; 
	
	newRow[0]=1;
	int x=1;
	for(int i=0;i<prevRow.length-1;i++)
	{
		int res = prevRow[i]+ prevRow[i+1];
		newRow[x++]=res;
	}
	
	newRow[x]=1;
	
	
	return newRow;
	
	}
	
	
	// BigInteger implementation of the geneate nth row method, to handle large values overflow
	
	public static BigInteger[] generateNthRowL(int n)
	{
	if(n==1)
	{
	return new BigInteger[]{BigInteger.ONE};
	}
	if(n==2)
	{
	return new BigInteger[]{BigInteger.ONE,BigInteger.ONE};
	}
	
	BigInteger[] prevRow = generateNthRowL(n-1);
	BigInteger[] newRow = new BigInteger[prevRow.length+1]; 
	newRow[0]= BigInteger.ONE;
	int x=1;
	for(int i=0;i<prevRow.length-1;i++)
	{
		BigInteger res = prevRow[i].add(prevRow[i+1]);
		newRow[x++]=res;
	}
	newRow[x]=BigInteger.ONE;
	
	return newRow;
	}
	

	public static void printArray(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		
	}
	
	// implementation of printArray for BigInteger[]
	public static void printArray(BigInteger[] arr)
	{
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i].toString()+"  ");
		
	}
	
	
	public static void main(String[] args)

	{
		//for(int i=1;i<10;i++)
	    //{
	    	PascalsTriangle.printArray(PascalsTriangle.generateNthRow(100));
		//System.out.println();
	   // }
	}
	
}

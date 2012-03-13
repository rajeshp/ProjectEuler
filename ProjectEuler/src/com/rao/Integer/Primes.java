package com.rao.Integer;
import java.util.*;
public class Primes {
	
	 ArrayList<Integer> primes = new ArrayList<Integer>();
	
	int[] primes_array ;
	
	public Primes()
	{
	
		
	}

	public Primes(int n)
	{
	  primes_array = generatePrimes(n);
	  for(int i=0;i<primes_array.length;i++)
		  primes.add(new Integer(primes_array[i]));
	  
	}
	
	public ArrayList<Integer> getPrimesArrayList()
	{
		return primes;
	}
	
	
	public int[] generatePrimes(int limit)
	{
				int a[] = new int[limit];
		
				for(int i=0;i<limit;i++)
					a[i]=i+2;
				
				for(int i=0;i<limit;i++)
				{
					if(a[i]==-1)
						continue;
					else
					{
					
						
					 for(int j=i+1;j<limit;j++)
					 {
						 if(a[j]==-1)
						 continue;
						 else
						 {
						if(a[j]%a[i]==0)
							a[j]=-1;
						 }
						 						 
					 }
						
					}
					
					
				}
				
				int b[] = new int[limit];
				int k=0;
				for(int i=0;i<limit;i++)
				{
					
					if(a[i]!=-1)
					{
						b[k++]=a[i];
					}
				}
				
				
		return b;
		
	}
	
	

}
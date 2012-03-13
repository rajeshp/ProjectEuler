package com.rao.Integer;

import java.util.*;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;

public class MyInteger {

	
  public int findgcd(int a, int b)
  {
	  if(b==0)
		  return a;
	  
	 return findgcd(b,a%b);
	  
  }
  
  public int LCM(int a, int b)
  {
	  return a*b/findgcd(a, b);
  }
  
  
  public static void main(String[] argStrings)
  {
	  MyInteger objInteger = new MyInteger();
	  
	  System.out.println("The gcd of 2336 & 1314 is : "+objInteger.findgcd(2336, 1314));
	  System.out.println("The gcd of 6 & 9 is : "+objInteger.findgcd(9,6));
	  
	  System.out.println("The LCM of 2336 & 1314 is : "+objInteger.LCM(2336, 1314));
	 
	  Map<Integer,Integer> mobj = objInteger.getprimefactors(52);
	  
	  objInteger.printMap(mobj);
	  
  }
  
  
  public void printMap(Map<Integer,Integer> m)
  {
 Collection<Integer> collection = m.values();
 Iterator iterator = collection.iterator();

 while(iterator.hasNext())
	 System.out.println(iterator.next());
 
  }
  
  public Map<Integer,Integer> getprimefactors(int a)
  {
	  HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
	 
	  
	  
	 Primes objprimes = new Primes ();
	 
	 int x = (int) a/2 +1;
	 
	 int[] primes_list = objprimes.generatePrimes(x);
	  
	 int power=0;
	 
	  for(int i=0;i<primes_list.length ;)
	  {
	    if(a%primes_list[i]==0 && primes_list[i]>0 )
	    {
	    	power++;
	    	a= a/primes_list[i];
	    	if(map.containsKey(primes_list[i]))
	    	{
	    		map.remove(primes_list[i]);
	    		map.put(primes_list[i], power);
	    	}else
	    	map.put(primes_list[i], power);
	    	i=0;
	    }
	    else {
			i++;
			power=0;
		}
		  
	  }
	  
	  return map;
  }
	
}

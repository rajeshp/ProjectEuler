import java.util.*;

public class PE17 {
HashMap<Integer, String> hmap = new HashMap<Integer, String> ();



	public PE17()
	{
		hmap.put(0, "zero");
		hmap.put(1, "one");
		hmap.put(2, "two");
		hmap.put(3, "three");
		hmap.put(4, "four");
		hmap.put(5, "five");
		hmap.put(6, "six");
		hmap.put(7, "seven");
		hmap.put(8, "eight");
		hmap.put(9, "nine");
		hmap.put(10, "ten");
		
		hmap.put(11, "eleven");
		hmap.put(12, "twelve");
		hmap.put(13, "thirteen");
		hmap.put(14, "fourteen");
		hmap.put(15, "fifteen");
		hmap.put(16, "sixteen");
		hmap.put(17, "seventeen");
		hmap.put(18, "eighteen");
		hmap.put(19, "nineteen");
		hmap.put(20, "twenty");
		
		hmap.put(30, "thirty");
		hmap.put(40, "forty");
		hmap.put(50, "fifty");
		hmap.put(60, "sixty");
		hmap.put(70, "seventy");
		hmap.put(80, "eighty");
		hmap.put(90, "ninety");
		hmap.put(100, "hundred");
		
		
		
		
	}


public static void main(String[] argStrings)
{
	PE17 objPe17 = new PE17();
	int[] n = objPe17.getdigits(219);
	
//	int n1 = objPe17.func1(219);
	
	int n2 = objPe17.pow(3);
}


public int func1(int n)
{
	if(n>0)
	{
		if(hmap.get(n)==null)
		{int[] numArray = getdigits(n);
		int count=0;
		StringBuffer sBuilder = new StringBuffer();
		while(count<numArray.length)
		{
			sBuilder.append(hmap.get(numArray[count]*pow(count)));
			sBuilder.append(" ");
			count++;
		}
		
		return sBuilder.length();
		}
		else {
			return hmap.get(n).length();
		}
		
	}
	else	
	return -1;
}


public int pow(int n)
{
	if(n==0)
		return 1;
	else {
		return 10 * pow(n-1);
	}
}


	public int[] getdigits(int n)
	{
		String strnum= ""+n;
		int num[] = new int[strnum.length()];
	
		int x=0;
		while(n>0)
		{
		num[x++]=n%10;
		n=n/10;
		}
	
		return num;
	}



}

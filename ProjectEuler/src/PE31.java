import java.util.ArrayList;
import java.util.HashMap;



public class PE31 {
ArrayList<Integer> currencies = new ArrayList<Integer>(); 	
HashMap<Integer, Integer> hMap = new HashMap<Integer, Integer>();

public PE31()
{
	currencies.add(1);
	currencies.add(2);
	currencies.add(5);
	currencies.add(10);
	currencies.add(20);
	currencies.add(50);
	currencies.add(100);
	currencies.add(200);
	
	
	hMap.put(1, 1);
	hMap.put(2, 2);
	hMap.put(3, 2);
	
	
}


	public static void main(String[] argStrings)
	{
		PE31 objPe31 = new PE31();
		System.out.println("Amount : \t  No of Ways it can be made :");
		
		for(int i=0;i<=200;i++)
		System.out.println(i+"  \t  " +objPe31.myfunc(i));
	}
	
	public int myfunc(int n)
	{
		if(n<=0)
			return 0;
		
		if(currencies.indexOf(n)!=1)
			return 1+myfunc(n-1);
		
		if(hMap.containsKey(new Integer(n)))
		return (Integer) hMap.get(n);
		
		return 1 + myfunc(n-1);
		
	}
	
}

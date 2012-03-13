import java.util.*;
public class PE44 {
ArrayList pentagonaList = new ArrayList();


public static void main(String[] argStrings)
{
	PE44 objPe44 = new PE44();
	objPe44.generatePentagonalNumbers(10000);
	objPe44.MyFunc();
}
	

public void MyFunc()
{
	for(int i=0;i<pentagonaList.size();i++)
	{
		for(int j=0;j<i;j++)
		{
			int sum = (Integer) pentagonaList.get(i) +  (Integer)pentagonaList.get(j);
			int diff= (Integer)pentagonaList.get(i) - (Integer)pentagonaList.get(j);
			diff = Math.abs(diff);
			
			if(pentagonaList.indexOf(sum)!=-1 && pentagonaList.indexOf(diff)!=-1)
			System.out.println( pentagonaList.get(i)+ "  " + pentagonaList.get(j)+ "  "+ sum + "  "+ diff);
			
		}	
		
	}
	
}


public void generatePentagonalNumbers(int limit)
{
	for(int i=1;i<limit;i++)
	 pentagonaList.add(getNthPentagonalNumber(i));
	
	
}

public int getNthPentagonalNumber(int n)
{
	return n*(3*n-1)/2;
	
}
	
}

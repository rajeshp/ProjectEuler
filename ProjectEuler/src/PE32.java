import java.util.HashSet;
import java.util.Set;


public class PE32 {

	
	public static void main(String[] args)
	{
		Set<Double> hSet = new HashSet<Double>();
		
		for(int i=1;i<5000;i++)
		{
			
			for(int j=1;j<i;j++)
			{
				double product = i*j;
				StringBuilder sBuilder = new StringBuilder(); 
				sBuilder.append(i);
				sBuilder.append(j);
				sBuilder.append(product);
				if(isPandigital(sBuilder))
				 hSet.add(product);
				
			}
			
		}
		
		long sum=0;
		for(Double integer : hSet)
		{
			sum+= integer;
		}
			
		System.out.println("Sum of all 1through 9 pandigital unique products is : "+sum);
	}
	
	public static  Boolean isPandigital(StringBuilder str)
	{  if(str.length()<9)
		return false;
	
		for(int i=1;i<10;i++)
		{
			if(str.indexOf(""+i)!=-1)
				continue;
			else {
				return false;
			}
		}
		
		return true;
	}
	
	
}

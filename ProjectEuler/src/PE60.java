import java.util.ArrayList;


public class PE60 {

	ArrayList<Integer> primes = null;
	
	int[] p = new int[]{3,7,109,673};
	
	
	public static void main(String[] args)
	{
		System.out.println("started....");
		Primes pobjPrimes = new Primes(1000000);
	    
		PE60 objPe60 = new PE60();
		
		
		
		objPe60.primes = pobjPrimes.getPrimesArrayList();
		
		int index=0;
		while(true)
		{
			int n = objPe60.primes.get(index);
			if(n<674)
				objPe60.primes.remove(index);
			else 
				break;
		
		}
		
		
		 objPe60.funcPE60();
		
		 System.out.println("finished....");
		 
		System.out.println("adgsdf");
		
		
		
	}
	
	
	public int funcPE60()
	{
		
		for(int i=0;i<primes.size();i++)
		{
				int j=0;
			for(j=0;j<p.length;j++)
			{
				if(!isConcatPrime(primes.get(i), p[j]))
					break;
				
				
			}
			
			if(j==5)
				{ System.out.println(primes.get(i));
				return primes.get(i);
				}
		}
		
		
		
		return 60;
	}
	
	public boolean isConcatPrime(int a, int b)
	{
				
		int n = Integer.parseInt(new String(a+""+b));
		int n1 = Integer.parseInt(new String(b+""+a));
		
		if(primes.indexOf(n1)!=-1 && primes.indexOf(n)!=-1)
			return true;
		else {
			return false;
		}
		
	}
	
	
}

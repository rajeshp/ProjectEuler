import java.util.*;


public class PE58 {
	
static	ArrayList<Integer> allDiagonalElements = new ArrayList<Integer>() ;
static	ArrayList<Integer> OnlyPrimeDiagonalElements = new ArrayList<Integer>() ;
	static ArrayList<Integer> primeArrayList ;
 int  base=1;
int step=2;
int sizeOfSprial;
int flag=0;

public PE58()
{
	
	Primes pobj = new Primes(1000000);
	
	primeArrayList = pobj.primes;
	allDiagonalElements.add(new Integer(1));
	
	
}

	
	public void generateRound(int start, int step, int round)
	{ 
		
		int newElement=start;
	    int r=0;
	    round++;
		while(r<4)
		{
	 newElement+= round*step;
	 allDiagonalElements.add(newElement);
	 if(r<3 && primeArrayList.indexOf(new Integer(newElement))!=-1)
		 OnlyPrimeDiagonalElements.add(new Integer(newElement));
		 
		 
	 r++;
		}
		
		base=newElement;
		step+=2;
		
		float total_elements = allDiagonalElements.size();
		float prime_elements = OnlyPrimeDiagonalElements.size();
		float per = prime_elements/total_elements;
		
		//if(per<10.00)
		System.out.println("Spiral of side "+(round+2+flag)+" prime Diagonal Elements %age = "+ prime_elements/total_elements * 100 );
		flag++;
	}
	
	public static void main(String[] argStrings)
	{
	PE58 oPe58 = new PE58();
	
	for(int side=0;side<150;side++)
	{
	oPe58.generateRound(oPe58.base,oPe58.step, side);
	}
	
	System.out.println("asdg");
	}
	

}

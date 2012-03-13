import java.math.BigInteger;

import com.rao.Integer.*;

public class PE15 {
	
	public static int findMiddleofArray(int[] arr)
	{
		return arr.length/2;
		
	}
	
	public static int findMiddleofArray(BigInteger[] arr)
	{
		return arr.length/2;
		
	}

	public static void main(String[] argStrings)
	{
		
		for(int i=2;i<=20;i++)
		{
			BigInteger[] res_arr = PascalsTriangle.generateNthRowL((i)*2+1); 			
		
			int middleElement = findMiddleofArray(res_arr);
			
			System.out.println("Grid "+i +"X"+i+" : PascalRow("+i*2+") : Middle Element - "+res_arr[middleElement]);
			
			//System.out.print("Grid "+i +"X"+i+" : PascalRow("+i*2+") : ");
			//PascalsTriangle.printArray(res_arr);
			//System.out.println();
			
		}
		
	}
	
	
}

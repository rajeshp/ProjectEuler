import javax.sql.RowSet;

import org.omg.CORBA.INTERNAL;


public class PE82 
{

 int[][] MAT = new int[][] { {131,673,234,103,18},
		 {201,96,342,965,150},{630,803,746,422,111}, 
		 {537,699,497,121,956},
		 {805,732,524,37,331}
		 };
 
 
 
 
 
 int MAXROWS=5;
 int MAXCOLS=5;
	
	public int getMinimumNeighbor(int x, int y)
	{
		int current = MAT[x][y];
		int lowestNeighbor=0;
		
		if(x>0 && x<MAXROWS && MAT[x-1][y]<=current)
		{
			lowestNeighbor = MAT[x-1][y];
		}
		
		if(x>0 && x<MAXROWS &&MAT[x+1][y]<=current && MAT[x+1][y]<lowestNeighbor)
		{
			lowestNeighbor = MAT[x+1][y];
		}
		
		if(y>0 && y<MAXCOLS && MAT[x][y-1]<=current&& MAT[x][y-1]<lowestNeighbor)
		{
			lowestNeighbor = MAT[x][y-1];
		}
		
		if(y>0 && y<MAXCOLS &&MAT[x][y+1]<=current&& MAT[x][y+1]<lowestNeighbor)
		{
			lowestNeighbor = MAT[x][y+1];
		}
		
		return lowestNeighbor;
	}
	
	
	
	
	
	public static void main(String[] args)
	{
		PE82 obj =  new PE82();
	 int x=	obj.getMinimumNeighbor(2, 2);
		
//	 System.out.println("current= "+obj.MAT[2][2]);
//	 System.out.println(x);
	 
	 
	 
	 for(int i=0;i<5;i++)
	 {
		 int sum=0;
		 for(int j=0;j<5;j++)
		 {
			 sum+= obj.getMinimumNeighbor(i, j);
			 
		 }
		 
		 System.out.println(sum);
		 
	 }
	 
	 
	 
	}
	
	
}

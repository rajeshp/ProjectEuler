import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;


public class PE67 {

	//ArrayList<Array> triangle = new ArrayList<Array>();
	
	ArrayList<Integer[]> triangle = new ArrayList<Integer[]>();
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		long start = System.currentTimeMillis();
		
		PE67 objPe67 = new PE67();
		
		objPe67.readTriangle();
		
		System.out.println("triangle read complete..");

		Integer[] row1 = objPe67.triangle.get(0);
		Integer[] row2 = objPe67.triangle.get(1);
		
		row2[0]+=row1[0];
		row2[1]+=row1[0];
		
		objPe67.calculateMaxSum();
		
		
		Integer[] lastRow = objPe67.triangle.get(objPe67.triangle.size()-1);
		
		int max=0;
		for(int i=0;i<lastRow.length;i++)
		{
			if(lastRow[i]>max)
				max=lastRow[i];
		}
		
		System.out.println(max);
		
		long end = System.currentTimeMillis();
		long  diff = (end - start);
		System.out.println("Total running time(in millis) : "+diff);
		
		/*for(int i=0;i<10;i++)
		{
			Integer[] row = objPe67.triangle.get(i);
			
			for(int j=0;j<row.length;j++)
			{
				System.out.print(row[j]+"  ");
				
			}
			
			System.out.println();
		}*/
		
		
	}

	
	
	public void calculateMaxSum()
	{
		
		for(int i=2;i<triangle.size();i++)
		{
			Integer[] current_row = triangle.get(i);
			
			
			
			
			for(int j=1;j<current_row.length-1;j++)
			{
				Integer[] previous_row = triangle.get(i-1);
			
				if(j==1)
				{
				current_row[0]+=previous_row[0];
				current_row[current_row.length-1]+=previous_row[previous_row.length-1] ;
				}
				
				int max=0;
				
				
				max = previous_row[j]>previous_row[j-1]?previous_row[j]:previous_row[j-1];
				
				
				current_row[j]+= max;
				
			}
			
		}
		
		
		
	}
	
	
	public void readTriangle()
	{
		try {
			
		FileReader fr = new FileReader(new File("/home/rajeshp/Desktop/triangle.txt"));
		
		BufferedReader br = new BufferedReader(fr);
		
		StringBuilder sb = new StringBuilder();
		String str =new String();
		int i=0;
		while((str=br.readLine())!=null)
		{
			triangle.add(readArray(str));
			
		}
		

		} catch ( FileNotFoundException fe) {
			// TODO: handle exception
		}
		catch ( IOException ie) {
			// TODO: handle exception
		}
		
	}
	
	public Integer[] readArray(String s)
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		StringBuilder sb = new StringBuilder(s);
		
		String sub =null;
		while(sb.length()>0)
		{
			
			if(sb.length()>3)
				sub = sb.substring(0, sb.indexOf(" "));
			else 
				sub= sb.substring(0,2);
			
			
			//System.out.println(sub);
			
			al.add(Integer.parseInt(sub));
			
			
			if(sb.length()>3)
			sb.delete(0, sb.indexOf(" ")+1);
			else
				sb.delete(0,2);
		}
		
		Integer[] a = new Integer[al.size()];
		
		return al.toArray( a);
	}
	
	
}

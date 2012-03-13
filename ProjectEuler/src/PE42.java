import java.io.*;
public class PE42 {

	static int totalTriangularWords;
	
	public static void main(String[] args)
	{
		PE42 objPe42 = new PE42();
		int w= objPe42.calculateWeight("SKY");
		
		System.out.println(objPe42.isTriangular(w));
		
		System.out.println();
		
		objPe42.ReadFile();
		
		System.out.println("Total Triangular words = "+totalTriangularWords);
		
	}
	
	
	public void ReadFile()
	{
		try{
			  // Open the file that is the first 
			  // command line parameter
			  FileInputStream fstream = new FileInputStream("/mnt/D/rajesh/MyWorkSpace/ProjectEuler/src/words.txt");
			  // Get the object of DataInputStream
			  DataInputStream in = new DataInputStream(fstream);
			  BufferedReader br = new BufferedReader(new InputStreamReader(in));
			  String strLine;
			  //Read File Line By Line
			  while ((strLine = br.readLine()) != null)   {
			  // Print the content on the console
			  System.out.println (strLine);
			  readWords(strLine);
			  }
			  //Close the input stream
			  in.close();
			    }catch (Exception e){//Catch exception if any
			  System.err.println("Error: " + e.getMessage());
			  }
		
	}
	
	
	public void readWords(String strline)
	{
		StringBuilder sBuilder = new StringBuilder(strline);
		
		while(sBuilder.length()>2)
		{
		
		int startpos = sBuilder.indexOf("\"");
		sBuilder.deleteCharAt(startpos);
		int endpos = sBuilder.indexOf("\"");
		String string = sBuilder.substring(startpos, endpos);
		
		int wt = calculateWeight(string);
		
		if(isTriangular(wt))
			totalTriangularWords++;
		
		//System.out.println(string);
		sBuilder.delete(startpos, endpos+1);
		
		}
		
	}
	
	
	public Boolean isTriangular(int weight)
	{
		weight*=2;
		int x = (int) Math.pow(weight, 0.5);
		x+=2;
		
		while(x>0)
		{
			if((x*(x+1))==weight)
				return true;
			
			x--;
		}
		
		
		return false;
	}
	
	public int calculateWeight(String str)
	{
		int i=0;
		char c;
		int x;
		int weight=0;
		while(i<str.length())
		{
			 c = str.charAt(i++);
			 x =(int)c;
			weight += x-65+1;
			
		}
		
	return weight;	
	}
	
}

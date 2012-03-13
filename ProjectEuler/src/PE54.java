
class card
{
	int value;
	int type=CardTypes.;
	
	
	
	
	
	
	public int validCardValues(String str)
	{
		int val=0;
		if(str.length()==1)
		{
			
			if(str.equals("J"))
				return 11;
			if(str.equals("Q"))
				return 12;
			if(str.equals("K"))
				return 13;
			if(str.equals("A"))
				return 14;
						
		  return Integer.parseInt(str);
		  		  
		}
		
		return -1;
	}
	
	public enum CardTypes{
		S,H,D,C
	};
	
		
}




public class PE54 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		card obj  = new card();
		card.myCars.
		
	}

}

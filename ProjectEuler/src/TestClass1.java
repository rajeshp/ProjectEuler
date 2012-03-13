import java.util.*;
public class TestClass1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Primes obj = new Primes(100);
		
		ArrayList<Integer> primes = obj.getPrimesArrayList();
		
		
		for(int i=0;i<primes.size();i++)
			if(primes.get(i)!=0)
			System.out.print(primes.get(i).toString()+ " ");
		
	}

}

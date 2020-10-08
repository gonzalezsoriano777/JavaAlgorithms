package algorithms;

// Able to find the absolute difference between 21 and any number inputed 

public class Diff21 {

	public int diff21(int n) {
		
		int diff = 21;
		
		if(n <= diff) {
			return diff - n;
		} else 
			return (n - 21) * 2;
		
	}
	
}

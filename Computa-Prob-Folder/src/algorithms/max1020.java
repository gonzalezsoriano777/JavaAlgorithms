package algorithms;

public class max1020 {
	
	public int Max1020(int a, int b) {
		
		if(b > a) {
			int temp = a;
			a = b;
			b = temp;
		}
		
		if(a >= 10 && a <= 20) 
			return a;
		if(b >= 10 && b <= 20) 
			return b;
		
		return 0;
		
	}

}

package hector0707;

public class MonkeyTrouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.print(sleepIn(true, true));
//		System.out.println();
//		System.out.println(theMonkeyTrouble(false, false));
//		System.out.println(sumDouble(2, 3));

		firstLastSix in = new firstLastSix();
		in.firstLast6();
		
	}
	
	public static boolean sleepIn(boolean weekday, boolean vacation){
		
		if(!weekday || vacation) {
			return true;
		}
		
		return false;
	}
	
	public static boolean theMonkeyTrouble(boolean aSmile, boolean bSmile) {
		
		// If both Monkey's are either smiling or upset... 
		//it will be considered MonkeyTrouble! ELSE: No MonkeyTrouble
		
		if(aSmile && bSmile || !aSmile && !bSmile) {
			return true;
		}
		
		return false;
		
	}
	
	public static int sumDouble(int a, int b) {
		
		if(a == b) {
			
			return (a + b) * 2;
			
		}
		
		return a + b;
		
	}

}

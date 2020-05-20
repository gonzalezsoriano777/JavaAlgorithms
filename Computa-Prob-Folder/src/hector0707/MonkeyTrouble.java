package hector0707;

public class MonkeyTrouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(theMonkeyTrouble(false, false));

	}
	
	public static boolean theMonkeyTrouble(boolean aSmile, boolean bSmile) {
		
		// If both Monkey's are either smiling or upset... 
		//it will be considered MonkeyTrouble! ELSE: No MonkeyTrouble
		
		if(aSmile && bSmile || !aSmile && !bSmile) {
			return true;
		}
		
		return false;
		
	}

}

package hector0707;

public class StringTokens {
	
	public void tokenString() {
	
		String[] tokens = "He is a very very good boy, isn't he?".split("[ |!|,|\\?|\\.|_|'|@|]+");
	       
		for(String token : tokens){
	       System.out.println(token);
		
	    }
	}
}

package hector0707;

public class StringTokens {
	
	public void tokenString() {
	
		Scanner sc = new Scanner(System.in);
        
        if (! sc.hasNext()) {
            System.out.println("0");  
            return;
        }
        
        String line = sc.nextLine().trim();
        
        if (line.length() == 0) {
            System.out.println("0");  
            return;
        }
        
        String[] sLine = line.split("[!,?._'@ ]+");
        System.out.println(sLine.length);  
        for (String s : sLine) 
            System.out.println(s.trim());   
		
	}
}

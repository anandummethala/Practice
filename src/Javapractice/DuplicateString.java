package Javapractice;

public class DuplicateString {

	public static void main(String[] args) {
	
		
		String str = "W3schoolchs";
		
		char inp[] = str.toCharArray();
		
		for(int i = 0; i<str.length(); i++) {
			
			for(int j= i+1; j<str.length(); j++) {
				
				if (inp[i]==inp[j]) {
					
					System.out.println(inp[j]);
					
					
				}
			}
		}

	}

}
package Javapractice;

public class CountVowels {

	public static void main(String[] args) {
		
		
		String s = "anandu";
		
		for(int i = 0; i<s.length(); i++) {
			
			char ch = s.charAt(i);
			
			
			if((ch == 'a') || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u')) {
				
				System.out.println(ch);
				
			}
		}

	}

}

package practiceall;

public class ReverseSring2 {

	public static void main(String[] args) {
		
		String name = "dravid";
		
		String rev = "";
		
		int len  = name.length();
		
		
		for(int i = len-1; i>=0; i--) {
			
			
			rev = rev + name.charAt(i);
			
		
		}
		
		System.out.println(rev);
	
		
		 if(name.equals(rev))  {
	         System.out.println("Entered string/number is a palindrome.");  
	         
		 }
	      else {
	         System.out.println("Entered string/number isn't a palindrome."); 
	         
	      }
	
		
	/*	
		StringBuffer sf = new StringBuffer(name);
		System.out.println(sf.reverse());
		*/
		
	}

}


   
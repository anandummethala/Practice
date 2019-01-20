package practiceall;

public class JavaProgramming {

	public static void main(String[] args) {
	
		String input = "JAVAPROGRAMMING";
		
	for(int i = 0;  i<input.length(); i++) {
			
			for(int j = i+1; j<input.length(); j++) {
				
				if(i == j) {
					System.out.println("duplicate element is:" + input.charAt(i));
					
				}
			}

	}

	}
}




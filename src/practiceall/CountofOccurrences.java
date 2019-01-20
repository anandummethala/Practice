package practiceall;

public class CountofOccurrences {

	public static void main(String[] args) {

		String s = "GOOGLLLLLEE";

		int result = s.length()-s.replace("L", "").length();
		
		System.out.println(result);
		
	}

}

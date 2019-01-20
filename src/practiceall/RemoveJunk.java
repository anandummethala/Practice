package practiceall;

public class RemoveJunk {

	public static void main(String[] args) {
		
		String s = "!!#!@#!@#!@#!@#@#!@#@Anand is a bad man";
		
		String s1 = "Anand";
		
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		s1 = s1.replaceAll("n", "u");
		System.out.println(s);
		System.out.println(s1);

	}

}

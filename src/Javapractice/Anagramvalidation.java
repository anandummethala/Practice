package Javapractice;

import java.util.Arrays;

public class Anagramvalidation {

	public static void main(String[] args) {
	
		

		String str1 = "java";
		String str2 = "avaj";
		
		System.out.println("Both are anagrams: " + anagramCheck(str1, str2));
	
		
	}
	
	public static boolean anagramCheck(String str1, String str2) {
		
		char[] inp1 = str1.toCharArray();
		char[] inp2 = str2.toCharArray();
		
		Arrays.sort(inp1);
		Arrays.sort(inp2);
		
        return Arrays.equals(inp1, inp2);

	}

}

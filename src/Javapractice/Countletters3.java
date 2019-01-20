package Javapractice;

import java.util.HashMap;
import java.util.Map;

public class Countletters3 {

	public static void main(String[] args) {

		String Str1 = "helloworld";
		
		String newString= "";
	       String Str2 = "";
	        for (int i= 0; i < Str1.length(); i++) {
	        	
	                newString = Str1.charAt(i) + ",";

	                Str2 = Str2 + newString;  

	        }
	       System.out.print(Str2);

	}
	
}
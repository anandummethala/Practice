package Javapractice;

import java.util.HashMap;
import java.util.Map;

public class Countletters {

	public static void main(String[] args) {

		String s = "javaisatoughprmogramminglanguage";
		
		Map<Character, Integer> count = new HashMap<Character, Integer>();
		
		for(Character c : s.toCharArray()) {
			
			if(count.containsKey(c)) {
				
				count.put(c, count.get(c) + 1);
			}
			
			else {
				
				count.put(c, 1);
			}
		}

		
		System.out.println(count);
	}

}

package Javapractice;

import java.util.HashSet;
import java.util.Set;

public class DuplicateArray {

	public static void main(String[] args) {
	
		String num[] = {"Java", "Maven", "Jenkins", "Selenium", "Java", "Selenium"};
		
		
	/*	for(int i = 0; i<num.length; i++) {
			
			for(int j = i+1; j<num.length; j++) {
				
				if(num[i]==num[j]) {
					
					System.out.println(num[j]);
				}
			}
		}*/
		
		
		Set<String> store = new HashSet<String>();
		for(String name: num) {
			if(store.add(name)==false) {
				System.out.println(name);
			}
		}
		
		
		
		

	}

}

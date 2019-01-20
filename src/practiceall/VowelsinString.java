package practiceall;

import org.openqa.selenium.support.ui.Wait;

public class VowelsinString {

	public static void main(String[] args) {
		
		
		String vow = "james";
		
		for(int i = 0; i< vow.length(); i++) {
			
			char ch = vow.charAt(i);
			
			if((ch=='a') || (ch=='e') || (ch=='i') || (ch=='o')|| (ch=='u')){
				
				
				System.out.println(ch);
			}
		}

	}

}










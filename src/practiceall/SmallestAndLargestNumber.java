package practiceall;

import java.util.Arrays;

import javax.print.attribute.standard.NumberUpSupported;

public class SmallestAndLargestNumber {

	public static void main(String[] args) {
	
		int num[] = {-10, 24, 50, -88, 64256};
		int largest = num[0];
		int smallest = num[0];
		
		for(int i = 1; i<num.length; i++) {
			
			if(num[i]>largest) {
				
				largest = num[i];
				
			}
			
			else if(num[i]<smallest) {
				smallest = num[i];
				
			}
		}
		
		System.out.println("\n given array is:"+ Arrays.toString(num));
		System.out.println("Largest Number is:"+ largest);
		System.out.println("Smallest Number is:"+ smallest);

	}

}

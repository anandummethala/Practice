package Javapractice;

public class LargestSmallest {

	public static void main(String[] args) {
		
		int num[] = {-39, -23, -18, 5, 67, 578};
		
		int largest = num[0];
		int smallest = num[0];
		
		for(int i = 0; i<num.length; i++) {
			
			if(num[i]>largest) {
				
				largest = num[i];
				
			}
			
			if(num[i]<smallest) {
				
				smallest = num[i];
			}
			
			}

		System.out.println("largest:" + largest);
		System.out.println("smallest:" + smallest);
	}

}

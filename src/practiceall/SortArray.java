package practiceall;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		
		
		int array[] = {1, 5, 3, 2, 4};
		
		Arrays.sort(array);
		
		
		for(int i=0; i<=array.length-1; i++) {
			
			System.out.println(array[i]);
		}

	}

}

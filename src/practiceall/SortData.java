package practiceall;

import java.util.Arrays;

public class SortData {

	public static void main(String[] args) {
	
		
		int array[] = {1, 3, 6, 5, 4, 2};
		
		Arrays.sort(array);
		
		for(int i = 0; i<=array.length-1; i++) {
			
			System.out.println(array[i]);
			
		}

	}

}

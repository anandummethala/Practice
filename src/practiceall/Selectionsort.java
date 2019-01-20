package practiceall;

public class Selectionsort {

	public static void main(String[] args) {
		
		int temp = 0;
		int min;
		
		int a[] = {23, 12, 45, 32, 29, 17};
		
		for(int i = 0; i<a.length; i++) {
			
			min = i;
			
			for(int j = i+1; j<a.length; j++ ) {
				
				if(a[j]<a[min]) {
					
					min = j;
				}
			
			
			}
			
			temp = a[i];
			a[i] = a[min];
			a[min] = temp;
			
		}

		for(int i=0; i<a.length; i++) {
			
			System.out.println(a[i]);
		}
	}

}

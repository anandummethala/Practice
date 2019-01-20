package practiceall;

public class ReverseInteger2 {

	public static void main(String[] args) {
		

		int num = 787;
		int rev = 0;
		int temp;
		
		temp = num;
		
       while(num!=0) {
			
			rev = rev*10 + num%10; 
			num = num/10;
			
		}
		
		System.out.println(rev);
		
		if(temp==rev) {
			
			System.out.println("Palindrome");
		}
		
		else {
			
			System.out.println("Not a Palindrome");
		}
		
		/*int sin = 896;
		System.out.println(new StringBuffer(String.valueOf(sin)).reverse());*/
	}

}
	




package practiceall;

public class ReverseInteger {

	public static void main(String[] args) {
		
		// 1. using string
		int num = 12345;
		int rev = 0;
		
		while(num !=0) {
			rev = rev*10 + num%10;
			num = num/10;
			
		}
		
		System.out.println(rev);
		
		
        // 2. using string buffer method:
		
		int num1 = 156;
		System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
	}

}
	

//new StringBuffer(String.valueOf(num1).reverse());


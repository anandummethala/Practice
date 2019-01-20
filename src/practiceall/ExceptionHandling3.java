package practiceall;

public class ExceptionHandling3 {

	public static void main(String[] args) {
		
		// throw: when we want to throw the exception deliberately
		
		System.out.println("ABC");
		
		try {
			throw new Exception("Anand Exception");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		System.out.println("ABCG");
		
	}

	
	
	
}


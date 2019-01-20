package practiceall;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		
		try {
			
			int i = 9/0;
			
			}
		catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("Got the message");
		}
		
		//Throwable: super class of all errors and exception
		//Object: super class of all the classes
		
		System.out.println("ABC");
	}

}

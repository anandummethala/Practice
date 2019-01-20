package practiceall;

public class tryabdcatch {

	public static void main(String[] args) {
		
	try {	
		int i = 9/0;
		}
catch(NumberFormatException e)
	{
	
	e.printStackTrace();
	
	System.out.println("Running catch block");
	}
	
	/*finally {
		
		System.out.println("Running the final block");
	}*/
	
}
}
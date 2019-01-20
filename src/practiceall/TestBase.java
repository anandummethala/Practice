package practiceall;

public class TestBase {

	
	// having same method name and different parameters:(but same method name name and same parameters are not allowed)
	
	public static void main(String[] args) {
		
		System.out.println("main method-1");
		
		main("Testing");
		main(10, 20);
		main(55);
		
		

	}
	
public static void main(String args) {
		
		System.out.println("main method-2");

	}
	
public static void main(int a) {
		
		System.out.println("main method-3");
	
	}


public static void main(int a, int b) {
	
	System.out.println("main method-4");
	
	

}

}

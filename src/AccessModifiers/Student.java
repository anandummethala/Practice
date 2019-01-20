package AccessModifiers;

public class Student {

	  protected static String  name = "Lion";
	
	
	public static int King(int a, int b) {
		
		
		
		int c = a+b;
		
		System.out.println("I am the King");
		
		return c;
		
	}
	
	
	public static void main(String[] args) {
		
		
		int sum = King(13, 17);
		System.out.println(sum);
			
			
		}
		
	}
	

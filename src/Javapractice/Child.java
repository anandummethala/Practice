package Javapractice;

public class Child extends Super{

	    public Child() {
	    	
	    	super();
	    
	    	System.out.println("This is a child class");
	    	
	    }
	    
	    public void great() {
	    	
	    	
	    	System.out.println("This is good");
	    }
	
	public static void main(String[] args) {
		
		 //Child obj = new Child();
		 Child obj1 = new Child();
		 obj1.great();

	}

}

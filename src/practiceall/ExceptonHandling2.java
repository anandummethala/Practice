package practiceall;

public class ExceptonHandling2 {

	public static void main(String[] args){
		
		ExceptonHandling2 obj =  new ExceptonHandling2();
		obj.sum();
		System.out.println("ABCD");
	
	}

	
	public void sum() {
		
		try {
			div();
		}
		catch(ArithmeticException e){
			
		}
	}
	
	public void div() throws ArithmeticException{
		
		int i = 9/0;
	}
}

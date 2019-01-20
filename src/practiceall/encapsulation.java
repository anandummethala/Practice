package practiceall;

public class encapsulation {
	
	
	private String name; 
	
	private int rollno;
	
	String subject;
	
	void setName(String name) {
		this.name = name;
		
	}
	
	String getName() {
		
		return name;
	}

	public static void main(String[] args) {

			
		encapsulation e = new encapsulation();
		
		e.setName("Anand");
		
		System.out.println(e.getName());
	
		

	}

}

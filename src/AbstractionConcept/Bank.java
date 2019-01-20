package AbstractionConcept;

public abstract class Bank {

	
	int amt = 100;
	final int rate = 10;
	static int loanRate = 5;
	
	
	//partial abstraction
	//hiding the implementation logic-- is called Abstraction
	//Abstract class can have abstract methods and non abstract methods
	//cannot create the object of abstract classes
	
	public abstract void loan(); //abstract method -- no method body
	
	
	
	// non abstract methods:
	
	public void credit() {
	System.out.println("Bank---credit");
	
	}
	
	public void debit() {
		System.out.println("Bank---debit");
		
		}
	
	}
	

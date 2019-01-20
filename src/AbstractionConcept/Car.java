package AbstractionConcept;

public interface Car {

	int wheels = 4; // by defeault it will be treated as static and final
	
	//always define abstract methods--
	//no method body
	//only method declaration
	//we achieve 100% abstraction
	//can not create the object of interface
	//only final and static variables can be defined
	
	public void start();
	public void stop();
	public void refuel();
	
	
	
}

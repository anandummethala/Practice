package practiceall2;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTable {

	public static void main(String[] args) {
		
		
		Hashtable h1 = new Hashtable();
		
		h1.put(1, "Raj");
		h1.put(2, "Srivastav");
		h1.put(3, "Comedy");
		
		
		Hashtable h2 = new Hashtable();
		
		h2 = (Hashtable)h1.clone();

		
		System.out.println(h2);
	
	
	
	
	//Enumeration:
	
	Enumeration e = h1.elements();
	
	while(e.hasMoreElements()) {
		
		System.out.println(e.nextElement());
	}
	
	
	//Set:
	
	System.out.println("**&*&*&*&*&****&**");
	
	Set s = h1.entrySet();
	System.out.println(s);

	
	// clear
	//containsValue
	//equals
	//hashCode()
	//get(key)
	
}
}
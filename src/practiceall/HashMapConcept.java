package practiceall;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapConcept {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Mistake");
		hm.put(2, "Made");
		hm.put(3, "Easy");
		
		
		System.out.println(hm.get(1));
		
		
		
		for(Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " +m.getValue());
		}
		
       hm.remove(2);
      System.out.println(hm);
      
      
      
      
    HashMap<Integer, Employee> emp = new HashMap<Integer, Employee>();
      
      Employee e1 = new Employee("Tom", 25, "admin");
      Employee e2 = new Employee("Marvolo", 26, "test");
      Employee e3 = new Employee("Riddle", 27, "qa");
      
      emp.put(1, e1);
      emp.put(2, e2);
      emp.put(3, e3);
      
      
      for(Entry<Integer, Employee> m : emp.entrySet()) {
    	int key = m.getKey();
    	Employee e = m.getValue();
    	System.out.println("Employee" + key + "Info: ");
    	
    	System.out.println(e.name +" "+ e.age+" "+ e.dept); 
    	
    	
    	
      }
      
      
      
      
      
      
      
      
      
      
	}

}

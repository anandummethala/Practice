package practiceall2;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapConcept {

	public static void main(String[] args) {
		
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
			
			
		hm.put(1, "Soldier");
		hm.put(2, "Winner");
		
		
		hm.get(1);
		
		System.out.println(hm);
		
       for(int i=1; i<=hm.size(); i++) {
    	   
    	   System.out.println(hm.get(i));
       }
		

       for(Entry<Integer, String> m: hm.entrySet()) {
    	   
    	   int k = m.getKey();
    	   String v = m.getValue();
    	   
    	   System.out.println(k + v);
    	   
       }
       
       System.out.println("*************************************");
       
       
       Employee e1 = new Employee("Anand", 34, "Cognizant", "QA");
       Employee e2 = new Employee("Ummethala", 64, "TCS", "Dev");
       
       HashMap<Integer, Employee> hm1 = new HashMap<Integer,Employee>();
       
       hm1.put(1, e1);
       hm1.put(2, e2);
       
       for(Entry<Integer, Employee> m1 : hm1.entrySet()) {
    	   
    	   int k1 = m1.getKey();
    	   Employee v1 = m1.getValue();
    	   
    	   System.out.println("Value of"+ " "+ k1+ " "+ "is" );
    	   System.out.println(v1.name + v1.age + v1.company + v1.dept);
    	   
       }
       
       
	}

}
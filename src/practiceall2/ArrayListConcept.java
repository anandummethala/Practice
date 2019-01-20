package practiceall2;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		
		ArrayList ar = new ArrayList();
		
		ar.add(23);
		ar.add(45);
		ar.add(27);
		
		ar.remove(1);
		
		System.out.println(ar.size());
		System.out.println(ar.get(1));

		for(int i=0; i<ar.size(); i++) {
			
			System.out.println(ar.get(i));
		}
		
		
		Employee e1 = new Employee("Raju", 24, "Fargo", "QA");
		Employee e2 = new Employee("Kiran", 25, "Fargo", "Dev");
		Employee e3 = new Employee("Kohli", 26, "Fargo", "Test");
		
		ArrayList<Employee> ar1 = new ArrayList();
		
		ar1.add(e1);
		ar1.add(e2);
		ar1.add(e3);
		
		Iterator<Employee> it = ar1.iterator();
		
		while(it.hasNext()) {
			
			Employee emp = it.next();
			
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.company);
			System.out.println(emp.dept);
			
		}
		
		System.out.println("**************************");
		
		ArrayList ar5 = new ArrayList();
		
		
		
		
	}

}

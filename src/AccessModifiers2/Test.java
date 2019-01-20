package AccessModifiers2;

import AccessModifiers.Student;

public class Test extends Student {

	public static void main(String[] args) {
		
		
		Student man = new Student();
		
		System.out.println(man.name);
				
		int k = man.King(20, 25);	
		System.out.println(k);

	}

}

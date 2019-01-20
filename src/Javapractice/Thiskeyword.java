package Javapractice;

public class Thiskeyword {
	
	String name;
	int age;
	
	public Thiskeyword(String name, int age) {
		
		this.name = name;
		this.age = age;
		
		System.out.println(name);
		System.out.println(age);
	}

	public static void main(String[] args) {
		
		Thiskeyword obj = new Thiskeyword("John", 14);
		Thiskeyword obj1 = new Thiskeyword("John", 19);
	}

}

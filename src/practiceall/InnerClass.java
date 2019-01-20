package practiceall;

 class InnerClass {

	int i;
	
	
	class InsideClass{
		
		int j;
		
	}
	
	public static void main(String[] args) {
		
		InnerClass obj = new InnerClass();
		obj.i = 15;
		
		InnerClass.InsideClass obj1 = obj.new InsideClass();
		
		obj1.j = 17;

		
		System.out.println(obj1.j);
	}

}

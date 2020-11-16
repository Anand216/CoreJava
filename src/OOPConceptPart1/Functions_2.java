package OOPConceptPart1;

public class Functions_2 {

	public static void main(String[] args) {
		
		Functions_2 obj = new Functions_2();
		
		//one object will be created, "obj" is the reference variable name and referring to newly created object
		//after creating the object, the copy of all non static functions/methods will be given to this object
		obj.function1();
		
		int sum = obj.function2();
		System.out.println(sum);
		
		String op = obj.function3();
		System.out.println(op);
		
		double d = obj.division(4, 2);
		System.out.println(d);
	}
	
	
	//these are non static method
	
	//void -- does not return any value
	//return type void
	public void function1() {
		System.out.println("Inside function1 method");
	}
	//return type int
	//return type should be same as the data type of returning variable
	public int function2() {
		
		System.out.println("Inside function2 method");
		int a = 10;
		int b = 20;
		int c = a + b;
		
		return c;
	}
	
	//return type String
	public String function3() {
		System.out.println("Inside function3 method");
		
		String s = "Selenium";
		
		return s;
	}
	
	//return type double
	public double division(int x, int y) {
		System.out.println("Inside division method");
		
		double d = x/y;
		return d;
		
	}
}

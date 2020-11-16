package OOPConceptPart1;

public class MethodOverloading_4 {

	public static void main(String[] args) {
		
		MethodOverloading_4 obj = new MethodOverloading_4();
		
		obj.sum();
		obj.sum(5);
		obj.sum(5.0);
		System.out.println(obj.sum(10, 20));
		
		
	}
	//main method can be overloaded
	
	public static void main(int a) {
		
	}
	public static void main(double x) {
		
	}	
	//we can not create a method inside another method
	//duplicate methods - i.e same method with same number of arguments are not allowed
	//Method overloading - when the method name is same with different arguments or 
	//input parameters and with different data types within the same class
	
	public void sum() {
		System.out.println("Without any parameters");
	}
	
	public void sum(int i) {
		
		System.out.println(i);
	}

	public void sum(double i) {
		
		System.out.println(i);
	}
	public int sum(int x, int y) {
		int z = x+y;
		return z;
	}

}

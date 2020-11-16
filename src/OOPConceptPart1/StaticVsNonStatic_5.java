package OOPConceptPart1;

public class StaticVsNonStatic_5 {
	
	String name = "Tom";
	static int age = 12;

	public static void main(String[] args) {

		//static methods can be called directly
		staticSum();
		//or static methods can be called by their classname
		StaticVsNonStatic_5.staticSum();
		
		//Non static methods should be accessed after creating the object of the class
		StaticVsNonStatic_5 obj = new StaticVsNonStatic_5();
		obj.nonStaticSum();
		
		//see the below difference static variable age got called directly
		//however non static variable name needs help of object reference variable "obj", 
		//to get it displayed on console
		System.out.println(age);
		System.out.println(obj.name);
	}

	public static void staticSum() {
		
		System.out.println("Inside staticSum");
		
		int x = 5;
		int y = 15;
		int z = x + y;
		System.out.println("From staticSum, The sum of x and y is: "+z);
	}
	
	public void nonStaticSum() {
		System.out.println("Inside nonStaticSum");
		
		int x = 10;
		int y = 20;
		int z = x + y;
		System.out.println("From nonStaticSum, The sum of x and y is: "+z);
	}
}
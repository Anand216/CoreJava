package JavaBasics;

public class ConstructorConcept_6 {

	//default constructor - no parameter
	public ConstructorConcept_6() {
		System.out.println("Default Constuctor");
	}
	//Constructors can be overloaded
	public ConstructorConcept_6(int i) {
		System.out.println("Single Param constructor");
		System.out.println("The value of i is "+i);
	}
	public ConstructorConcept_6(int i, int j) {
		System.out.println("Two Param constructor");
		System.out.println("The value of i is "+i);
		System.out.println("The value of j is "+j);
	}

	public static void main(String[] args) {

		ConstructorConcept_6 obj = new ConstructorConcept_6();
		ConstructorConcept_6 obj1 = new ConstructorConcept_6(10);
		ConstructorConcept_6 obj2 = new ConstructorConcept_6(20, 30);
	}

}

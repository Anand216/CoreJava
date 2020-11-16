package JavaBasics;

public class ConstructorWithThisKeyword_7 {
	//global variables
	String name;
	int age;

	public ConstructorWithThisKeyword_7(String name, int age) {
		this.name = name;
		this.age = age;
		
		System.out.println(name + " "+ age);
	}
	
	public static void main(String[] args) {
		ConstructorWithThisKeyword_7 obj = new ConstructorWithThisKeyword_7("Ani", 42);
		ConstructorWithThisKeyword_7 obj1 = new ConstructorWithThisKeyword_7("Mou", 32);		
	}

}

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
		ConstructorWithThisKeyword_7 obj = new ConstructorWithThisKeyword_7("Tom", 12);
		ConstructorWithThisKeyword_7 obj1 = new ConstructorWithThisKeyword_7("Mike", 22);		
	}

}

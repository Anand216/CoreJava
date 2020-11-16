package JavaBasics;

public class ParentConstructorWithSuper_8 {
	
	public ParentConstructorWithSuper_8() {
		System.out.println("Default parent constructor");
	}
	
	public ParentConstructorWithSuper_8(int i) {
		System.out.println("One parameter parent constructor");
		System.out.println(i);
	}
	
	public ParentConstructorWithSuper_8(int i, int j) {
		System.out.println("Two parameter parent constructor");
		System.out.println(i+ " and "+j);
	}

}

package JavaBasics;

public class ChildConstructorWithSuper_8 extends ParentConstructorWithSuper_8{

	public ChildConstructorWithSuper_8() {
		super();
		System.out.println("Child constructor");
	}

	public ChildConstructorWithSuper_8(int i) {
		super(i);
		System.out.println("Child constructor");
	}

	public ChildConstructorWithSuper_8(int i, int j) {
		super(i, j);
		System.out.println("Child constructor");
	}

	public static void main(String[] args) {
		ChildConstructorWithSuper_8 obj = new ChildConstructorWithSuper_8();
		ChildConstructorWithSuper_8 obj1 = new ChildConstructorWithSuper_8(10);
		ChildConstructorWithSuper_8 obj2 = new ChildConstructorWithSuper_8(20, 30);
	}
}

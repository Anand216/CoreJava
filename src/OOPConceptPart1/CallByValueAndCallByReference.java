package OOPConceptPart1;

public class CallByValueAndCallByReference {

	public static void main(String[] args) {
		int x = 5;
		System.out.println("Before increment, value of x is: "+x);
		
		increment (x);
		System.out.println("After increment, value of x is: "+x);
	}

	static void increment (int p) {
		p = p + 1;
	}
}

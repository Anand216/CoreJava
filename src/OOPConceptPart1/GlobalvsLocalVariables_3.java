package OOPConceptPart1;

public class GlobalvsLocalVariables_3 {

	// these are global/class variables
	String name = "Tom";
	int age = 12;

	public static void main(String[] args) {

		// these are local variables
		String name = "Mikki";
		int age = 5;

		System.out.println(name + " and " + age);

		GlobalvsLocalVariables_3 obj = new GlobalvsLocalVariables_3();

		System.out.println(obj.name + " and " + obj.age);

		String f = obj.function();

		System.out.println(f);

	}

	public String function() {

		// local variable for function()
		String s = "Tedd " + "and " + "22";

		return s;

	}

}

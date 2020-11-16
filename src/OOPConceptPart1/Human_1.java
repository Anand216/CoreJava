
//this example is the reference for classes and objects

package OOPConceptPart1;

public class Human_1 {

	//class variables
	double weight;
	double height;
	
	
	public static void main(String[] args) {
		//new Human() -- this is the object of Human class
		//new keyword is used to create the object
		//ani, mou -- are the reference variables
		Human_1 obj = new Human_1();
		Human_1 obj1 = new Human_1();
		
		obj.weight = 62.5;
		obj.height = 5.5;
		
		obj1.height=5.00;
		obj1.weight=50.00;
		
		System.out.println(obj.height);
		System.out.println(obj.weight);	
		
		System.out.println(obj1.height);
		System.out.println(obj1.weight);	
	}

}

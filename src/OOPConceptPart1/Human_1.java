
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
		Human_1 ani = new Human_1();
		Human_1 mou = new Human_1();
		
		ani.weight = 62.5;
		ani.height = 5.5;
		
		mou.height=5.00;
		mou.weight=50.00;
		
		System.out.println(ani.height);
		System.out.println(ani.weight);	
		
		System.out.println(mou.height);
		System.out.println(mou.weight);	
	}

}

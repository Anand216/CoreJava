package JavaBasics;

public class ArrayConcept_4 {

	public static void main(String[] args) {
		
		int a[] = new int[4]; //array size initialization
		
		//array values input
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		
		System.out.println(a[1]); // printing individual elements
		
		System.out.println("Array length is "+(a.length));//printing array length
	
		//printing all the elements
		for(int i=0; i<a.length; i++) {

			System.out.println("Element at "+i+ " position is "+a[i]);
			
		}
		
		//Object Array
		
		Object ob[] = new Object[4];
		ob[0] = "Tom";
		ob[1] = 12.33;
		ob[2] = "1/1/1999";
		ob[3] = 'A';
		
		System.out.println(ob[2]);
		
		System.out.println(ob.length);
	}

}

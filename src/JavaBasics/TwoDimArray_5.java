package JavaBasics;

public class TwoDimArray_5 {

	public static void main(String[] args) {
		
		int m[][] = new int[2][3];
		
		//1st row
		m[0][0] = 1;
		m[0][1] = 2;
		m[0][2] = 3;
		
		//2nd row
		m[1][0] = 4;
		m[1][1] = 5;
		m[1][2] = 6;
		
		System.out.println(m[0][2]);
		System.out.println(m.length); //number of rows
		System.out.println(m[0].length); // number of columns 
		
		//how to print all the values at one go
		System.out.println("++++++");
		for(int row=0; row<(m.length); row++) {
			for(int col=0; col<(m[0].length); col++) {
				System.out.println("Number at cell m"+"["+row+"]"+"["+col+"]"+ " is: "+m[row][col]);
			}
		}

	}

}
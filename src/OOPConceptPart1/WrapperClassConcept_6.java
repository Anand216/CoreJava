package OOPConceptPart1;

public class WrapperClassConcept_6 {

	public static void main(String[] args) {
		String s1 = "100";
		String s2 = "12.33";
		String s3 = "true";
		
		
		int i = Integer.parseInt(s1);
		System.out.println(i);
		
		//just a test
		int z = Integer.numberOfTrailingZeros(i);
		System.out.println("Zeros are "+z);
		
		double d = Double.parseDouble(s2);
		System.out.println(d);
		
		boolean b = Boolean.parseBoolean(s3);
		System.out.println(b);
		
		
		
//		String s4 = "100A";
//		int j = Integer.parseInt(s4); //NumberFormatException
//		System.out.println(j);

	}

}

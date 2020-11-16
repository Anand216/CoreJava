package OOPConceptPart2;

public interface USBank {
	
	//only declaration of methods
	//no method body - only method prototype
	//in interface, we can declare the variables and vars are by default public, static and final in nature
	//variable values can not be changed
	//no static methods in interface
	//we can not create the object of interface
	//interface is abstract in nature
	
	
	int min_bal = 100;
	
	public void credit_US();
	
	public void debit();
	
	public void transferMoney();
	
	

}

package OOPConceptPart2;

public class HSBCBank implements USBank, UKBank{

	//if a class is implementing any interface then it's mandatory to define/override all the methods of interface.
	
	static int HSBCmin_bal = 200;
	public void credit_US() {
		System.out.println("HSBC -- US -- credit");
	}

	public void credit_UK() {
		System.out.println("HSBC -- UK -- credit");
	}
	
	public void debit() {
		System.out.println("HSBC -- debit");
	}

	public void transferMoney() {
		System.out.println("HSBC -- transferMoney");
	}
	
	public void educationLoan() {
		System.out.println("HSBC -- educationLoan");
	}
	
	public void carLoan() {
		System.out.println("HSBC -- carLoan");
	}

	public void mutualFund() {
		System.out.println("HSBC -- mutualFund");
	}


}

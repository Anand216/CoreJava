package OOPConceptPart2;

public class TestBank {

	public static void main(String[] args) {
		HSBCBank obj = new HSBCBank();
		
		System.out.println(USBank.min_bal); //can be called by interfacename.variablename
		System.out.println(UKBank.min_bal);
		System.out.println(HSBCBank.HSBCmin_bal);
		obj.credit_US();
		obj.credit_UK();
		obj.debit();
		obj.transferMoney();
		obj.educationLoan();
		obj.carLoan();
		obj.mutualFund();
		
		USBank obj1= new HSBCBank();
		
		obj1.credit_US();
		obj1.debit();
		obj1.transferMoney();
	}
		
}

class Accounting{
	public double valueOfSupply;
	public double vatRate;
	public double expenseRate;
	
	public void print() {
		System.out.println("Value of supply : " + valueOfSupply);
		System.out.println("VAT : " + getVAT());
		System.out.println("Total : " + getTotal());
		System.out.println("Expense : " + getExpense());
		System.out.println("Income : " + getIncome());
		System.out.println("Dividend 1 : " + getDividend1());
		System.out.println("Dividend 2 : " + getDividend2());
		System.out.println("Dividend 3 : " + getDividend3());
	}

	public  double getDividend1() {
		return getIncome() * 0.5;
	}
	
	public  double getDividend2() {
		return getIncome() * 0.3;
	}
	
	public  double getDividend3() {
		return getIncome() * 0.2;
	}

	public  double getIncome() {
		return valueOfSupply - getExpense();
	}

	public  double getExpense() {
		return valueOfSupply * expenseRate;
	}

	public  double getTotal() {
		return valueOfSupply + getVAT();
	}

	public  double getVAT() {
		return valueOfSupply * vatRate;
	}
}


public class AccountingClassApp {
	
	public static void main(String[] args) {
//		Accounting.valueOfSupply = 10000.0;
//		Accounting.vatRate = 0.1;
//		Accounting.expenseRate = 0.3;
//		Accounting.print();
//		// Accounting이라는 클래스를 사용함으로써 소속 관계를 명확하게 할 수 있음
//		// -> 다른 취지(목적)의 코드들과 명확하게 구별 가능(구조 개선)
//		
//		// . . . anotheraVariable = ...;
//		// . . . anotherMethod = ...; 
//		//...

		
		// instance
		Accounting a1 = new Accounting();
		a1.valueOfSupply = 10000.0;
		a1.vatRate = 0.1;
		a1.expenseRate = 0.3;
		a1.print();
		
		Accounting a2 = new Accounting();
		a2.valueOfSupply = 20000.0;
		a2.vatRate = 0.05;
		a2.expenseRate = 0.2;
		a2.print();
		
		a1.print();
	}


}

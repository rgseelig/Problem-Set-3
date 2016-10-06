
public class Test {
	public static void main(String[] args){
		
		Account testAccount = new Account(1122, 20000.00, .045);
		
		testAccount.Withdraw(250000.00);
		
		testAccount.Deposit(3000.00);
		
		System.out.println("Balance: "+testAccount.getBalance()+"\nMonthly Interest: "+ 
		testAccount.getMonthlyInterestRate()+ "\nAccount Created: " + testAccount.getDateCreated());
		
	}

}

public class SavingsAccount extends BankAccount 
{ // savings account
	double rate = 2.5; // variables declared
	int savingsNumber = 0;
	String accountNumber;

	public SavingsAccount(String name, double amt) { // constructor declared
		super(name, amt);
		this.accountNumber = super.getAccountNumber().concat("-".concat(Integer.toString(savingsNumber)));
		savingsNumber++;
	}
	

	public void postInterest() { // interest method
		double depostCalculation = (((rate / 100) * getBalance()) / 12);
        super.deposit(depostCalculation);
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public SavingsAccount(SavingsAccount originalSavingsAccount, double initialBalance)
    {
        super(originalSavingsAccount, initialBalance);
        this.rate = originalSavingsAccount.rate;
        this.savingsNumber = originalSavingsAccount.savingsNumber;
        this.accountNumber = super.getAccountNumber().concat("-".concat(Integer.toString(savingsNumber)));
        savingsNumber++;
    }
}

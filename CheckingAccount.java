
public class CheckingAccount extends BankAccount {

	private static double FEE = 0.15;
	private int transactionCount;

	public CheckingAccount(String str, double amount) {
		super(str, amount);
		this.setAccountNumber((super.getAccountNumber().concat("-10")));
// TODO Auto-generated constructor stub
	}

	@Override
	public boolean withdraw(double amount) {
// TODO Auto-generated method stub
		double newAmount = amount + FEE;
		return super.withdraw(newAmount);
	}

}

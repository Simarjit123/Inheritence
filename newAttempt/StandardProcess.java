package newAttempt;

public interface StandardProcess {
	public void deposit(double amountDeposit);

	public void withdraw(double withdrawMoney);

	public void fundTransfer(double amount);

	boolean userIdentification(String cardNumber1, String password);

}

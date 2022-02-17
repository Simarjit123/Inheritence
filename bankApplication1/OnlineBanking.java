
import BankingMainApplication.BankingRules;
import BankingMainApplication.StandardProcess;

public class OnlineBanking extends BankingRules implements StandardProcess {
	private String accName;
	private String pin;
	private double initialBalance = 1000;
	public double balance;
	int cardBalance = 1000;

	public OnlineBanking(String accName, String pin) {
		this.accName = accName;
		this.pin = pin;
	}

	@Override
	public void deposit(double amount) {

		balance = initialBalance + amount;

	}

	@Override
	public void withraw(double amount) {

		if (amount < balance) {

			balance = balance - amount;

		} else {
			System.out.println("not enough funds");
		}
	}

	@Override
	public void fundTransfer(double amount) {
		// TODO Auto-generated method stub
		if (balance >= amount) {
			balance = balance - amount;
			double finalCardBalance = balance + cardBalance;
			System.out.println("balance is successfully trasfered: " + finalCardBalance);
		}

	}

	@Override
	public void investment() {
		// TODO Auto-generated method stub

	}

	@Override
	public void userIdentify() {
		// TODO Auto-generated method stub

	}

}

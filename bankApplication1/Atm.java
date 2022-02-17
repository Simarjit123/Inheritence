
import BankingMainApplication.BankingRules;
import BankingMainApplication.StandardProcess;

public class Atm extends BankingRules implements StandardProcess {
	public double balance;
	private double initialBalance = 1000;
	private String accName;
	private String pin;

	public Atm(String accName, String pin) {
		this.accName = accName;
		this.pin = pin;
	}

	@Override
	public void deposit(double amount) {
		if (amount < 0) {
			System.out.println("please enter valid amount to be deposited");
		} else {
			balance = initialBalance + amount;
		}
	}

	@Override
	public void withraw(double amount) {
		if (amount < balance) {
			balance = balance - amount;

		}

		else {
			System.out.println("not sufficient balance to transfer");

		}

	}

	@Override
	public void fundTransfer(double amount) {

		// TODO Auto-generated method stub

	}

	@Override
	public void investment() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean verifyUserIdentify(String accName, String pin) {
		if (accName.equals(this.accName) && pin.equals(this.pin)) {
			return true;
		}
		return false;
	}

	@Override
	public void userIdentify() {
		// TODO Auto-generated method stub

	}

}
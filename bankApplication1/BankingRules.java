
public abstract class BankingRules {
	private int withdrawLimit;
	private int transactionLimit;
	private int pin;
	private double amountWithdrawn;

	public BankingRules() {

	}

	public int withdrawLimit(int withdrawAmount) {
		return withdrawAmount;

	}

	public int transactionNumber() {

		return transactionLimit;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public abstract void userIdentify();

	public boolean verifyUserIdentify(String accName, String pin) {
		// TODO Auto-generated method stub
		return false;
	}
}

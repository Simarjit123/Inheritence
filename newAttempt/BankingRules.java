package newAttempt;

public abstract class BankingRules extends PersonDetails implements StandardProcess {
	private double transactionLimit = 3;

	int withdrawLimit = 900;
	int transferLimit = 200;

	public double isTransactionAllowed() {
		return transactionLimit;

	}

	public int withdrawaLimit() {

		return withdrawLimit;

	}

	public boolean fundTransferAllowed(int amountTransfer) {

		if (amountTransfer <= transferLimit) {
			return true;
		}
		return false;
	}

	public boolean pinChange(String changedPin) {
		if (changedPin.length() == 4) {
			return true;
		}
		return false;
	}

	public boolean userIdentification(String cardNumber, String password) {
		return false;
	}

	public boolean changeSecurityCode(String newCode) {
		return false;
	}

	public abstract void investment(double d);

}
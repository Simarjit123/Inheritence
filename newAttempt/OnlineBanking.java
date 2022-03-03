package newAttempt;

public class OnlineBanking extends BankingRules implements StandardProcess {

	int max = 8;

	double balance = 500;

	@Override
	public void deposit(double amountDeposit) {

		if (amountDeposit > 0)
			newBalance = getAccountBalance() + amountDeposit;
		setAccountBalance(newBalance);
		System.out.println("New balance after Deposit is:  " + newBalance);

	}

	@Override
	public void withdraw(double withdrawMoney) {
		if (withdrawMoney <= getAccountBalance()) {
			newBalance = getAccountBalance() - withdrawMoney;
			setAccountBalance(newBalance);
			System.out.println("   balance after withdrawal is : " + newBalance);
		}

	}

	@Override
	public void fundTransfer(double amount) {

		if (amount > 0) {
			newBalance = getAccountBalance() - amount;
			setAccountBalance(newBalance);
			System.out.println("amount transferred from your account is :" + newBalance);

		}
	}

	@Override
	public boolean userIdentification(String cardNumber1, String pin) {
		if (cardNumber1.equals(getCardNumber()) && pin.equals(getPinNo())) {
			return true;
		}

		return false;
	}

	public boolean changePin(String pinNew) {
		if (pinNew.length() <= 4) {
			return true;
		}
		return false;
	}

	@Override
	public void investment(double d) {
		// TODO Auto-generated method stub

	}

}

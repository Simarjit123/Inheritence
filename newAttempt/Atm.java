package newAttempt;

public class Atm extends BankingRules implements StandardProcess {
	double newBalanace;
	

	@Override
	public void deposit(double amountDeposit) {

		if (amountDeposit > 0)
			newBalanace = amountDeposit + getAccountBalance();
		setAccountBalance(newBalanace);
		System.out.println("New balance after Deposit is:  " + getAccountBalance());

	}

	@Override
	public void withdraw(double withdrawMoney) {
		if (withdrawMoney > 0) {
			newBalanace = getAccountBalance() - withdrawMoney;
			setAccountBalance(newBalanace);
			System.out.println("   balance after withdrawal is : " + newBalanace);
		}

	}

	@Override
	public void fundTransfer(double amount) {
		if (amount > 0) {
			newBalanace = getAccountBalance() - amount;
			setAccountBalance(newBalanace);
			System.out.println("amount transferred from your account is :" + newBalanace);

		}
	}

	@Override
	public boolean userIdentification(String cardNumber, String pinNumber) {
		 
		if (cardNumber.equals(getCardNumber()) && pinNumber.equals(getPinNo())) {
			return true;
		}
		return false;
}
		
			
	
	@Override
	public void investment(double d) {
		// TODO Auto-generated method stub

	}

}

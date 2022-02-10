//debit subclass to withdraw money and print balance after withdrawal
public class Debit extends BankInfo {
	int minBalance = 50;
	double remainingBalance;

	Debit(String cardNumber, int pinNumber) {
		super(cardNumber, pinNumber);

	}

	void moneyWithdraw(int amountWithdrawn) {
		System.out.println("Enter money to withdraw");

		int newBalance = -amountWithdrawn;

	}
}

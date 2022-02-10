//check credit limit
public class Credit extends BankInfo {
	int spendLimit = 1000;//set credit limit
	int monthlyFee;

	Credit(String cardNumber, int pinNumber, int monthlyFee, int amount) {

		super(cardNumber, monthlyFee);

	}

	public double purchase(double amountSpent) {
		newBalance = balance + amountSpent;

		if (newBalance > spendLimit) {
			System.out.println("your amount is exceeding limit");

		} else {
			System.out.println("your amount is below limit");

		}
		return newBalance;
	}

}

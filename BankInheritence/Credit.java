
public class Credit extends BankInfo {
	int spendLimit = 1000;// spend limit

	public boolean verifyCard;

	Credit() {

	}

	public int spendLimit() {
		return spendLimit;
	}

	public double purchase(double purchase) {

		double creditBalance = 0;
		if (purchase > spendLimit) {
			System.out.println(" Credit limit is exceeded,please try again.");
			creditBalance = newBalance - purchase;
		} else {
			System.out.println("Successfully purchased");

		}
		return creditBalance;
	}
}
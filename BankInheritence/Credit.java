import java.util.Scanner;
//check credit limit

public class Credit extends BankInfo {
	int spendLimit = 1000;// set credit limit
	int monthlyFee;
	Scanner sc = new Scanner(System.in);

	Credit(String cardNumber, int pinNumber, int monthlyFee, int amount) {

		super(cardNumber, monthlyFee);

	}

	public double purchase() {
		int amountSpent = 0;
		System.out.println("Enter amount you want to spend:");// spend limit is set to 1000;
		int amountSpent1 = sc.nextInt();
		newBalance = balance + amountSpent1;

		if (newBalance > spendLimit) {
			System.out.println("your amount is exceeding limit");

		} else {
			System.out.println("you are within the limit");

		}
		return 0;
	}

}

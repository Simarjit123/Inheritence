
//debit subclass to withdraw money and print balance after withdrawal
import java.util.Scanner;

public class Debit extends BankInfo {

	Scanner sc = new Scanner(System.in);

	Debit(String cardNumber, int pinNumber) {
		super(cardNumber, pinNumber);
	}

	void deposit1() {

		System.out.println("enter previous balance");
		newBalance = sc.nextInt();

		int deposit;
		System.out.println("enter amount to deposited");
		deposit = sc.nextInt();
		newBalance = newBalance + deposit;
	}

	public double withdraw() {
		System.out.println("Enter money to withdraw");
		double moneyWithdraw = sc.nextDouble();
		double finalBalance = (newBalance - moneyWithdraw);
		return finalBalance;

	}
}

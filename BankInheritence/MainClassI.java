
import java.util.Scanner;

public class MainClassI {

	public static void main(String[] args) {

		int pinNumber = 0;
		String cardNumber = null;

		Scanner sc = new Scanner(System.in);
		System.out.println("please select card type:debit / credit");

		String type = sc.next();

		switch (type) {
		case "debit":
			// debit child class is used to call parent class login verify method
			Debit debit = new Debit(cardNumber, pinNumber);
			// card no is set to 12345 & pin is set to 123
			System.out.print(" Enter card number: ");
			debit.setCardNo(sc.next());

			System.out.println("Enter pin number:");
			debit.setPinNum(sc.nextInt());

			if (debit.verifyCard(debit.getCardNo(), debit.getPinNum())) {

				System.out.println("successfull login & enter money to deposit");
				double amountToDeposit = sc.nextDouble();
				debit.depositMoney(amountToDeposit);
			}

			else {
				System.out.println("Not valid pin ");
			}
			break;
			
		case "credit":

			// Credit child class is used to call Parent class login verify method
			// credit lim it is 1000
			Credit credit = new Credit();
			System.out.print(" Enter card number: ");
			credit.setCardNo(sc.next());

			System.out.println("Enter pin number:");
			credit.setPinNum(sc.nextInt());

			if (credit.verifyCard(credit.getCardNo(), credit.getPinNum())) {
				System.out.println("Welcome to credit.Enter amount you want to spend from credit card");
				double purchase = sc.nextDouble();
				credit.purchase(purchase);
			} else {
				System.out.println("not valid pin");
			}
			break;
		}
	}
}
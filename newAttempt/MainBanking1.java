package newAttempt;

import java.util.Scanner;

public class MainBanking1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BankingRules bank = null;
		bank = new OnlineBanking();
	

		System.out.println("Please select   1 or 2 from following options 1. ATM 2. Online Banking");

		String choice = sc.next();

		switch (choice) {

		case "1":
			Atm atm = new Atm();

			System.out.println("Please provide your card number");
			String cardNumber = sc.next();
			System.out.println("Enter the 4 digit PIN");
			String pinNumber = sc.next();

			if (atm.userIdentification(cardNumber, pinNumber)) {
				System.out.println("Welcome " + bank.getAccounName());

				// cardNum=123456 & password=1234

				System.out.println("Please select one from following services");
				System.out.println("a. Deposit b.Withdraw c.Transfer ");

				String type = sc.next();
				switch (type) {
				case "a":
					System.out.println("Enter the amount to be deposited");
					double amountToDeposit = sc.nextDouble();
					atm.deposit(amountToDeposit);
					break;
				case "b":
					System.out.println("Enter the amount you need to withdraw");
					double amountToWithdraw = sc.nextDouble();
					atm.withdraw(amountToWithdraw);
					System.out.println("Your account balance is : " + atm.getAccountBalance());
					break;
				case "c":
					System.out.println("enter amount you want to transfer");
					double amount = sc.nextDouble();
					atm.fundTransfer(amount);

					break;

				default:
					System.out.println("Please select from the options available");

					break;
				}
				break;
			}

		case "2":
			OnlineBanking online = new OnlineBanking();
			System.out.println("Please provide your card number");
			String cardNumber1 = sc.next();
			System.out.println("Enter the 4 digit PIN");
			String pin = sc.next();

			if (online.userIdentification(cardNumber1, pin)) {
				System.out.println("Welcome " + bank.getAccounName());

				// cardNum=123456 & password=1234

				System.out.println("Please select one from following services");
				System.out.println("a.Deposit b.Withdraw c.fundTransfer d.change pin");

				String type = sc.next();
				switch (type) {
				case "a":
					System.out.println("Enter the amount to be deposited");
					double amountToDeposit = sc.nextDouble();
					online.deposit(amountToDeposit);

					break;
				case "b":
					System.out.println("Enter the amount you need to withdraw");
					double amountToWithdraw = sc.nextDouble();
					online.withdraw(amountToWithdraw);

					break;
				case "c":
					System.out.println("enter amount you want to transfer");
					double amount = sc.nextDouble();
					online.fundTransfer(amount);

					break;
				case "d":
					System.out.println("Enter 4 digit pin");
					String pinNew = sc.next();// maximum length of pin is set to 4
					if (online.changePin(pinNew)) {

						System.out.println("Successfully updated ");
					} else {
						System.out.println("please enter valid pin");
					}
					break;

				default:
					System.out.println("Please select from the options available");

					break;
				}

			} else {
				System.out.println("please enter valid cardNumber and password");
			}
			break;

		}

	}
}

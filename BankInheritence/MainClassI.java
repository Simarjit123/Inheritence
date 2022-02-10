
import java.util.Scanner;

public class MainClassI {

	public static void main(String[] args) {
		BankInfo bank = new BankInfo(null, 0);
		Credit credit = new Credit(null, 0, 0, 0);
		Debit debit = new Debit(null, 0);
		Scanner sc = new Scanner(System.in);
		// verify pinno & cardNo
		// card no is set to 4444 & pin is set to 1234
		System.out.print(" Enter card number: ");
		bank.setCardNo(sc.next());

		System.out.println("Enter pin number:");
		bank.setPinNum(sc.nextInt());
		// verify pin & card
		if (bank.verifyCard(bank.getCardNo(), bank.getPinNum())) {

			System.out.println("successfull login");
		}

		else {
			System.out.println("Not valid pin ");
		}

		// deposit amount
		System.out.println("please enter amount to be deposited");
		int deposit = (int) bank.deposit(sc.nextInt());

		System.out.println("Total balance is:" + deposit);

//enter amount spent to verify whether credit limit is exceeded or not
		System.out.println("Enter amount you want to spend:");
		int spent = sc.nextInt();
		credit.purchase(spent);

		// Money withdraw & print balance
		System.out.println("Enter money to withdraw");
	debit.moneyWithdraw(sc.nextInt());
		System.out.println("Remaining Balance: " +debit.newBalance);
	}
}
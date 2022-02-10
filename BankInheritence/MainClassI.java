
import java.util.Scanner;

public class MainClassI {

	public static void main(String[] args) {
		BankInfo bank = new BankInfo(null, 0);
		Credit credit = new Credit(null, 0, 0, 0);
		Debit debit = new Debit(null, 0);
		Scanner sc = new Scanner(System.in);
		// verify pinno & cardNo
		// card no is set to 12345 & pin is set to 123
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

		// deposit amount with new balance

		debit.deposit1();
		System.out.println("New balance is:" + debit.newBalance);

//enter amount to be spent to verify whether credit limit is exceeded or not

		credit.purchase();

		// Money withdraw & print balance

		System.out.println("balance after withdrawal is:" + debit.withdraw());

	}
}
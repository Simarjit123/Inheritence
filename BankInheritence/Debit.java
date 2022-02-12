
public class Debit extends BankInfo {

	public boolean verifyCard;
	int balance = 1000;

	Debit(String cardNo, int pinNum) {
		this.cardNo = cardNo;
		this.pinNum = pinNum;
	}

	public double depositMoney(double depAmount) {
		if (depAmount > 0) {
			newBalance = (int) (balance + depAmount);
			System.out.println("Transaction is successfully completed &  your new balance is:" + newBalance);
		} else {
			System.out.println("invalid amount");
		}
		return newBalance;
	}

}
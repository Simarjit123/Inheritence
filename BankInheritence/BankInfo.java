
//Parent class verify login by comparing cardno & pin no
//deposit balance in parent class
public class BankInfo {

	double amount;
	int pinNumber;
	String cardNumber;

	String cardNo;
	int pinNum;
	int balance = 500;
	double newBalance;

	BankInfo(String cardNumber, int pinNumber) {
		this.cardNumber = cardNumber;
		this.pinNumber = pinNumber;

	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNO) {

		this.cardNo = cardNO;
	}

	public int getPinNum() {
		return pinNum;
	}

	public void setPinNum(int pinNum) {

		this.pinNum = pinNum;
	}

	boolean verifyCard(String cardNumber, int pinNumber) {

		if (cardNumber.equals("41111") && (pinNumber == 1234)) {
			return true;

		}

		return false;

	}

//balance is common is parent and sub class
	public double getBalance() {

		return newBalance;
	}

	double deposit(int amount) {
		if (amount > 0) {
			newBalance = balance + amount;
			System.out.println("successful");
		} else
			System.out.println("not success");
		return newBalance;
	}
}
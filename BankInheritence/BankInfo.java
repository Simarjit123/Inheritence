import java.util.Scanner;

//Parent class verify login by comparing cardno & pin no
//deposit balance in parent class
public class BankInfo {

	double amount;
	int pinNumber;
	String cardNumber;

	String cardNo;
	int pinNum;
	int balance;
	double newBalance;
	Scanner sc = new Scanner(System.in);

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

		if (cardNumber.equals("12345") && (pinNumber == 123)) {
			return true;

		}

		return false;

	}

}
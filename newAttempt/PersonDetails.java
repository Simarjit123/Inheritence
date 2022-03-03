package newAttempt;

public class PersonDetails {

	private String accounName;
	private int accountNo;
	private String cardNumber;
	private String pinNo;
	private String password;
	public double accountBalance;
	double newBalance;

	

	PersonDetails() {
		this.accounName = "Simarjit";
		this.accountNo = 123456;
		this.cardNumber = "123456";
		this.pinNo = "1234";
		this.password = "welcome";
		this.accountBalance=1000.00;
	
	}

	public String getPinNo() {
		return pinNo;
	}

	public void setPinNo(String pinNo) {
		this.pinNo = pinNo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAccounName() {
		return accounName;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public String getCardNumber() {
		return cardNumber;
	}



	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public boolean userIdentification(String cardNumber1, String password) {
		return false;
	}

}

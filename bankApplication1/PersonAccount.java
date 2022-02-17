
public class PersonAccount {

	private int accountNo;
	public String accName;
	private int totalFundsAvailable;
	public String accountType;

	// Argument Constructor
	public PersonAccount(int accountNo, String accName, int totalFundsAvailable, String accountType) {
		this.accountNo = accountNo;
		this.accName = accName;
		this.totalFundsAvailable = totalFundsAvailable;
		this.accountType = accountType;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public int getTotalFundsAvailable() {
		return totalFundsAvailable;
	}

	public void setTotalFundsAvailable(int totalFundsAvailable) {
		this.totalFundsAvailable = totalFundsAvailable;

	}

	public String getAccType() {
		return accountType;
	}

	public void setAccType(String accountType) {
		this.accountType = accountType;
	}

}

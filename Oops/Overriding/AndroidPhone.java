package Overriding;

public class AndroidPhone extends Phone {

	@Override
	public void makePhoneCall() {
		System.out.println("Android phone is used to make phone call");
	}

	public void transferData() {
		System.out.println("Android phone data is transfered to android phones");
	}

	@Override
	public void switchON() {
		System.out.println("Android phone is Switched ON");
	}
}
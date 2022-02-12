package Overriding;

public class IosPhone extends Phone {
	@Override
	public void switchON() {
		System.out.println("Apple phone is Switched ON");
	}

	@Override
	public void makePhoneCall() {
		System.out.println("Android phone is used to make phone call");
	}

	public void faceTime() {
		System.out.println("Facetime is only available for apple products");
	}
}

package Overriding;

public class MainOverriding {
	public static void main(String[] args) {

		IosPhone ios = new IosPhone();
		AndroidPhone android = new AndroidPhone();

		android.sendMessage();
		android.makePhoneCall();
		ios.faceTime();
		ios.switchON();
		android.switchON();
		ios.makePhoneCall();

	}
}
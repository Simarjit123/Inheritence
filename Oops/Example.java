import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		

		int age = 0;

		int level = 0;

		String licenseIssued = "null";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age");
		age=sc.nextInt();
		System.out.println("Enter License type");
		licenseIssued=sc.next();
		

		if (age >= 16) {
			
			// Check level
			if (level == 0) {
				licenseIssued = "G1";
			} else if (level == 1) {
				licenseIssued = "G2";
			} else if (level == 2) {
				licenseIssued = "G";
			} else {
				System.out.println("not a valid level");
			}
			if (!licenseIssued.equals("none")) {
				System.out.println("Congratulation on getting license " + licenseIssued);
			}
		} else {
			System.out.println("Not eligible for driving license");
			
		}
	}

}

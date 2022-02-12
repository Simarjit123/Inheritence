import java.util.Scanner;

class ScannerExample {
	public static void main(String[] args) {
//create object of scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age");
		int obj = sc.nextInt();
		System.out.println("The age you entered is: " + obj);
	}
}
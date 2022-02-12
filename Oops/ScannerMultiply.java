import java.util.Scanner;

public class ScannerMultiply {
	public static void main(String[] args) {

		int num1 = 0;
		int num2 = 0;
		Scanner sc = new Scanner(System.in);
		

		System.out.println("Enter first number");
		num1 = sc.nextInt();
		System.out.println("Enter second number");
		num2 = sc.nextInt();
		int multiply = num1 * num2;
		System.out.println("Mutilpy result is:" +multiply);
	}

}


import java.util.InputMismatchException;
import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x, y;
		try {

			System.out.println("Enter value of x");
			x = sc.nextInt();
			System.out.println("Enter value of y");
			y = sc.nextInt();

			int c = x / y;

			System.out.println(" Division is: " + c);

		} catch (InputMismatchException inputmismatchexception) {
			System.out.println(" an integer value  is required");

		} catch (ArithmeticException arithemeticexception) {
			System.out.println("Can't divide a number by 0");
		}
	}
}

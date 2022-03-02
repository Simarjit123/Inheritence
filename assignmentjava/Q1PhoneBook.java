
import java.util.HashMap;
import java.util.Scanner;

public class Q1PhoneBook {

	public static void main(String[] args) {
		HashMap<String, Integer> phoneBook = new HashMap<String, Integer>();

		Scanner sc = new Scanner(System.in);

		phoneBook.put("simarjit", 123456789);
		phoneBook.put("neha", 12345678);
		phoneBook.put("aman", 123456);
		phoneBook.put("jagdeep", 12345);

		// Find the size of a HashMap
		System.out.println("PhoneBook contains information of " + phoneBook.size() + " users");

		// Iterating over keys
		for (String key : phoneBook.keySet()) {
			System.out.println("Key = " + key);
		}

		// Iterating over values
		for (Integer value : phoneBook.values()) {
			System.out.println("Value = " + value);
		}
		System.out.println("Enter name from list to find their information");
		String name = sc.next();

		if (phoneBook.containsKey(name)) {
			System.out.println("Number related to  " + name + " is " + phoneBook.get(name));

		} else {
			System.out.println("Details not found");
		}
	}
}

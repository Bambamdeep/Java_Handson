package JavaNewDemo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String days = scanner.nextLine();

		String result = switch (days.toLowerCase()) {
		case "monday", "tuesday", "wednesday", "thursday", "friday" -> "working Days";
		default -> "weekend";

		};
		System.out.println(result);
		int x = 18;
		String result1 = (x >= 18) ? "you can vote" : "you cannot vote";
		System.out.println(result1);
		String oddEven = (x % 2 == 0) ? "Even" : "Odd";
		System.out.println(oddEven);

	}

}

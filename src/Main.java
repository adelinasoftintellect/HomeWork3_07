import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");

		System.out.println("Please, enter your card");
		String a = input.nextLine();

		switch (a) {
		case "2":
			System.out.println("Valid card!");
			break;
		case "3":
			System.out.println("Valid card!");
			break;
		case "4":
			System.out.println("Valid card!");
			break;
		case "5":
			System.out.println("Valid card!");
			break;
		case "6":
			System.out.println("Valid card!");
			break;
		case "7":
			System.out.println("Valid card!");
			break;
		case "8":
			System.out.println("Valid card!");
			break;
		case "9":
			System.out.println("Valid card!");
			break;
		case "10":
			System.out.println("Valid card!");
			break;
		case "J":
			System.out.println("Valid card!");
			break;
		case "Q":
			System.out.println("Valid card!");
			break;
		case "K":
			System.out.println("Valid card!");
			break;
		case "A":
			System.out.println("Valid card!");
			break;

		default:
			System.out.println("Invalid card!");
			break;
		}
		input.close();

	}
}

import java.util.*;

public class VendingMAchine {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to our Vending Machine. Please select the snack number you wish to buy:");
		System.out.println(" 1. Snicker Bars \n 2. Pop-Tarts \n 3. Sun Chips \n 4. Nacho Doritos \n 5. Pretzels \n 6. Cheetos \n 7. Popcorn");
		
		String snack = scanner.nextLine();
		
		int total = 0;
		
		if (snack.equals("1")) {
			total = total + 1;
		} else if (snack.equals("2")) {
			total = total + 2;
		} else if (snack.equals("3")) {
			total= total + 2;
		} else if (snack.equals("4")) {
			total = total + 2;
		} else if (snack.equals("5")) {
			total = total + 1;
		} else if (snack.equals("6")) {
			total = total + 2;
		} else if (snack.equals("7")) {
			total = total + 1;
		} else
			System.out.println("Invalid choice. Please enter a valid snack number.");		
	}
}

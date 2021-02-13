import java.util.*;

public class VendingMAchine {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to our Vending Machine. Please select the snack number you wish to buy:");
		System.out.println(
				" 1. Snicker Bar \n 2. Pop-Tarts \n 3. Sun Chips \n 4. Nacho Doritos \n 5. Pretzels \n 6. Cheetos \n 7. Popcorn");

		String snack = scanner.nextLine();
		

		int total = 0;
		while (!snack.equals("1") ||!snack.equals("2") || !snack.equals("3") || !snack.equals("4") || !snack.equals("5") || !snack.equals("6") || !snack.equals("7")) {
			if (snack.equals("1")) {
				total = total + 1;
				System.out.println("You have selected 1. Snicker Bar.");
			
			} else if (snack.equals("2")) {
				total = total + 2;
				System.out.println("You have selected 2. Pop-Tarts.");
				break;
			} else if (snack.equals("3")) {
				total = total + 2;
				System.out.println("You have selected 3. Sun Chips.");
				break;
			} else if (snack.equals("4")) {
				total = total + 2;
				System.out.println("You have selected 4. Nacho Doritos.");
				break;
			} else if (snack.equals("5")) {
				total = total + 1;
				System.out.println("You have selected 5. Pretzels.");
				break;
			} else if (snack.equals("6")) {
				total = total + 2;
				System.out.println("You have selected 6. Cheetos.");
				break;
			} else if (snack.equals("7")) {
				total = total + 1;
				System.out.println("You have selected 7. Popcorn.");
				break;
			} else {
				System.out.println("Invalid choice. Please enter a valid snack number.");
				snack = scanner.nextLine();
			}
			
		}
		
		
	}
}

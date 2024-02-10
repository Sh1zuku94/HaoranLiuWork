import java.util.HashMap;
import java.util.Scanner;

public class BigYStorePizzaApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> sizes = new HashMap<>();
        sizes.put("small", 5);
        sizes.put("medium", 10);
        sizes.put("large", 15);
        sizes.put("super", 20);

        System.out.println("Welcome to BigY Store Pizza Ordering System!");
        System.out.println("Available sizes: small ($5), medium ($10), large ($15), super ($20)");
        System.out.print("Please select your sandwich size: ");
        String sizeChoice = scanner.nextLine().toLowerCase();

        if (!sizes.containsKey(sizeChoice)) {
            System.out.println("Invalid size selected. Please restart the application.");
            return;
        }

        System.out.println("\nHow many toppings would you like? ($0.50 each, 3 for $1.25)");
        int toppingsCount = scanner.nextInt();

        double toppingCost = 0;
        if (toppingsCount == 3) {
            toppingCost = 1.25;
        } else {
            toppingCost = toppingsCount * 0.50;
        }

        int basePrice = sizes.get(sizeChoice);
        double totalPrice = basePrice + toppingCost;

        System.out.println("\nOrder Summary:");
        System.out.println("Sandwich Size: " + sizeChoice + " ($" + sizes.get(sizeChoice) + ")");
        System.out.println("Toppings Count: " + toppingsCount + " ($" + toppingCost + ")");
        System.out.println("Total Price: $" + totalPrice);

        System.out.println("Thank you for ordering from BigY Store!");
    }
}

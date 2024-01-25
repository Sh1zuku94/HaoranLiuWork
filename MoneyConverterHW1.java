import java.util.Scanner;

public class MoneyConverterHW1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount in dollars: ");
        String input = scanner.nextLine();

        int cents = (int) (Double.parseDouble(input) * 100);
        int quarters = cents / 25;
        cents %= 25;
        int dimes = cents / 10;
        cents %= 10;
        int nickels = cents / 5;

        System.out.println("Quarters: " + quarters);
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickels: " + nickels);
    }
}

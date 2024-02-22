import java.util.Scanner;
import java.util.ArrayList;

public class DoubleValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        ArrayList<Double> numbers = new ArrayList<>();
        final double QUIT_VALUE = 99999; // quit value
        int maxEntries = 20; // Maximum number

        System.out.println("Enter up to 20 double values. Enter 99999 to quit.");

        while (numbers.size() < maxEntries) {
            System.out.print("Enter a number: ");
            double number = scanner.nextDouble(); // Read and input

            if (number == QUIT_VALUE) {
                break;
            } else {
                numbers.add(number); // Add number to the list
            }
        }

        if (numbers.isEmpty()) {
            System.out.println("Error: No numbers were entered.");
        } else {
            System.out.println("You entered the following numbers:");
            for (double number : numbers) { // Display each entered number
                System.out.println(number);
            }
        }

        scanner.close(); // end
    }
}

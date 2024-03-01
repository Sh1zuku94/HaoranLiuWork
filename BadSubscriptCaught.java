import java.util.Scanner;

public class BadSubscriptCaught {
    public static void main(String[] args) {
        String[] firstNames = {"John", "Jane", "Mary", "Mike", "David", "Sarah", "Chris", "Lisa", "Mark", "Emily"};

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter an index to retrieve the first name: ");
            int index = scanner.nextInt();

            System.out.println("The name at index " + index + " is " + firstNames[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index is out of bounds. Please enter a number between 0 and 9.");
        } finally {
            scanner.close();
        }
    }
}

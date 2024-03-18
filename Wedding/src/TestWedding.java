import java.time.LocalDate;
import java.util.Scanner;

import java.time.LocalDate;
import java.util.Scanner;

public class TestWedding {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //ask for bride's name
        System.out.println("Enter bride's first name:");
        String brideFirstName = input.nextLine();
        System.out.println("Enter bride's last name:");
        String brideLastName = input.nextLine();
        Person bride = new Person(brideFirstName, brideLastName);

        //do the same for the groom
        System.out.println("Enter groom's first name:");
        String groomFirstName = input.nextLine();
        System.out.println("Enter groom's last name:");
        String groomLastName = input.nextLine();
        Person groom = new Person(groomFirstName, groomLastName);

        //put the bride and groom together
        Couple couple = new Couple(bride, groom);

        //get the wedding date and place from the user
        System.out.println("Enter the wedding date (YYYY-MM-DD):");
        LocalDate weddingDate = LocalDate.parse(input.nextLine());
        System.out.println("Enter the wedding location:");
        String location = input.nextLine();

        //creating a Wedding object with the couple, date and location
        Wedding wedding = new Wedding(couple, weddingDate, location);

        //Displaying the wedding details
        System.out.println("Wedding Details:");
        System.out.println("Bride: " + wedding.getCouple().getBride().getFirstName() + " " + wedding.getCouple().getBride().getLastName());
        System.out.println("Groom: " + wedding.getCouple().getGroom().getFirstName() + " " + wedding.getCouple().getGroom().getLastName());
        System.out.println("Date: " + wedding.getWeddingDate());
        System.out.println("Location: " + wedding.getLocation());

        input.close();
    }
}

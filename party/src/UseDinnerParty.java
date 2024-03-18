// UseDinnerParty.java
import java.util.Scanner;

public class UseDinnerParty {
    public static void main(String[] args) {
        //Setting up to catch what the user types
        Scanner keyboard = new Scanner(System.in);
        //hold our party info
        DinnerParty aDinnerParty = new DinnerParty();
        // Asking how many people are coming
        System.out.print("Enter number of guests for the party >> ");
        int guests = keyboard.nextInt();
        aDinnerParty.setGuests(guests);
        System.out.println("The party has " + aDinnerParty.getGuests() + " guests");
        //Show the invitation message
        aDinnerParty.displayInvitation();

        System.out.print("Enter number of guests for the dinner party >> ");
        guests = keyboard.nextInt(); //get new guest count
        aDinnerParty.setGuests(guests); //update the party guest count

        //asking food option
        System.out.print("Enter the menu option -- 1 for chicken or 2 for veggie >> ");
        int choice = keyboard.nextInt(); //get their menu choice
        aDinnerParty.setDinnerChoice(choice); //save that choice

        //confirm the guest count and menu choice
        System.out.println("The dinner party has " + aDinnerParty.getGuests() + " guests");
        System.out.println("Menu option " + aDinnerParty.getDinnerChoice() + " will be served");
        //show the invitation again with updated info
        aDinnerParty.displayInvitation();
    }
}

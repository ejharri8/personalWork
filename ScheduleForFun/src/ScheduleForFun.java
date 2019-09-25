import java.util.*;

public class ScheduleForFun {
    public static void main (String [] args)
    {
        // variables
        Scanner scans = new Scanner(System.in);
        String input = "";
        Scheduler s = new Scheduler();
        String addClass;
        String toRemove;

        printMenu();
        do {
            input = scans.nextLine();
            switch (input) {
                case "V":
                    System.out.println("Your schedule has " + s.getSize() + " classes.");
                    s.viewClasses();
                    break;
                case "A":
                    System.out.println("What class would you like to add?");
                    addClass = scans.nextLine();
                    s.addClass(addClass);
                    System.out.println("Successfully added: " + s.lastAdded());
                    break;
                case "R":
                    System.out.println("What class would you like to remove?");
                    toRemove = scans.nextLine();
                    if (s.removeClass(toRemove))
                        System.out.println("Successfully Removed!");
                    break;
                case "Q":
                    System.exit(0);
                    break;
                case "?":
                    printMenu();

            }
        } while(!input.equalsIgnoreCase("q"));

    }

    public static void printMenu()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("\n Welcome to the Scheduler:\n" +
                "Enter a character to get started. \n" +
                "V | View Schedule\n" +
                "A | Add Item To Schedule\n" +
                "R | Remove Item from Schedule\n" +
                "Q | Quit\n" +
                "? | Print Menu\n");
    }

}


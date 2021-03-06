import java.util.Scanner;

public class Conversion {

    private static double distance;
    private static Scanner scnr = new Scanner(System.in);

    private static double showKilometers(double meters) {
        return meters * .001;
    }

    private static double showInches(double meters) {
        return meters * 39.37;
    }

    private static double showFeet(double meters) {
        return meters * 3.281;
    }

    private static void menu() {
        int choice;

        if (distance < 0) {
            System.out.println("You can't use negative numbers silly!");
        }
        else{
            System.out.println();
            System.out.println("1. Convert to Kilometers");
            System.out.println("2. Convert to Inches");
            System.out.println("3. Convert to Feet");
            System.out.println("4. Quit the program");
            System.out.println();

            System.out.print("Enter your choice: ");
            System.out.print("");

            choice = scnr.nextInt();
            if (choice == 1) {
                System.out.println();
                System.out.println(distance + " meters is " + showKilometers(distance) + " kilometers.");
                menu();
            } else if (choice == 2) {
                System.out.println();
                System.out.println(distance + " meters is " + showInches(distance) + " inches.");
                menu();
            } else if (choice == 3) {
                System.out.println();
                System.out.println(distance + " meters is " + showFeet(distance) + " feet.");
                menu();
            } else if (choice == 4) {
                System.out.println();
                System.out.println("exiting...");
                System.exit(0);
            } else {
                System.out.println("Please enter a valid choice");
                menu();
            }
        }


    }
    public static void main (String[]args){
        System.out.print("Enter a distance in meters: ");
        distance = scnr.nextDouble();
        menu();
    }
}

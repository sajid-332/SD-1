package com.mycompany.sdas1;
import java.util.Scanner;

public class JavaSwitch{

    public static void main(String[] args) {
        // Create a scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a number (1-7) representing the days of the week
        System.out.print("Enter a number between 1 and 7 to get the corresponding day of the week: ");
        int day = scanner.nextInt(); // Get the number input from the user

        // Switch case to print the corresponding day of the week
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid input. Please enter a number between 1 and 7.");
        }

        // Close the scanner
        scanner.close();
    }
}
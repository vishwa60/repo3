package tnsifassesment;

import java.util.Scanner;

public class NumberNamesPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (0 to 9): ");
        int number = scanner.nextInt();

        if (number >= 0 && number <= 9) {
            String numberName = getNumberName(number);
            System.out.println("Number Name: " + numberName);
        } else {
            System.out.println("Invalid input. Please enter a number between 0 and 9.");
        }
    }

    // Method to get the number name for a given digit
    private static String getNumberName(int digit) {
        switch (digit) {
            case 0:
                return "Zero";
            case 1:
                return "One";
            case 2:
                return "Two";
            case 3:
                return "Three";
            case 4:
                return "Four";
            case 5:
                return "Five";
            case 6:
                return "Six";
            case 7:
                return "Seven";
            case 8:
                return "Eight";
            case 9:
                return "Nine";
            default:
                return "Invalid Digit";
        }
    }
}
package tnsifassesment;

import java.util.Scanner;

public class NumberPuzzleSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int result;
        
        if (number > 50) {
            result = findDifferenceBetweenDigits(number);
        } else {
            result = findDifferenceBetweenReversedDigits(number);
        }

        System.out.println("Result: " + result);
    }

    // Method to find the difference between the digits of a number
    private static int findDifferenceBetweenDigits(int num) {
        int tensDigit = num / 10;
        int onesDigit = num % 10;
        return Math.abs(tensDigit - onesDigit);
    }

    // Method to reverse a number and find the difference between its digits
    private static int findDifferenceBetweenReversedDigits(int num) {
        int reversedNum = 0;
        while (num != 0) {
            reversedNum = reversedNum * 10 + num % 10;
            num /= 10;
        }

        return findDifferenceBetweenDigits(reversedNum);
    }
}




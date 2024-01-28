package tnsifassesment;

import java.util.Scanner;

public class OxygenProductionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the floor area of the room (in square meters): ");
        double floorArea = scanner.nextDouble();

        // Calculate the total number of plants, rounding to the nearest and lowest multiple of 10
        int totalPlants = calculateTotalPlants(floorArea);

        // Calculate the total oxygen production based on the number of plants
        double totalOxygenProduction = calculateOxygenProduction(totalPlants);

        // Display the results
        System.out.println("Total number of plants: " + totalPlants);
        System.out.println("Total oxygen production per day: " + totalOxygenProduction + " litres");
    }

    // Method to calculate the total number of plants
    private static int calculateTotalPlants(double floorArea) {
        // Calculate the number of plants based on the floor area, rounding to the nearest and lowest multiple of 10
        int plantsPerSquareMeter = 10;
        int totalPlants = (int) Math.round(floorArea * plantsPerSquareMeter / 10.0) * 10;

        return totalPlants;
    }

    // Method to calculate the total oxygen production based on the number of plants
    private static double calculateOxygenProduction(int totalPlants) {
        // Each mature plant produces 0.9 litres of oxygen per day
        double oxygenProductionPerPlant = 0.9;
        double totalOxygenProduction = totalPlants * oxygenProductionPerPlant;

        return totalOxygenProduction;
    }
}
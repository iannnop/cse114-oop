package main.Lab3;

import java.util.Scanner;

public class ShippingCost {
    public static void main(String[] args) {
        double weight;
        double cost = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the weight of the package (pounds):");
        weight = input.nextDouble();
        input.close();
        if (weight <= 0) {
            System.out.println("Invalid input.");
        }
        else if (weight > 20) {
            System.out.println("The package cannot be shipped.");
        }
        else {
            if (weight <= 1) {
                cost = 3.5;
            }
            else if (weight <= 3) {
                cost = 5.5;
            }
            else if (weight <= 10) {
                cost = 8.5;
            }
            else if (weight <= 20) {
                cost = 10.5;
            }
            System.out.printf("The shipping cost is $%.02f", cost);
        }

    }
}

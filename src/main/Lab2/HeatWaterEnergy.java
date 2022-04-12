package main.Lab2;

import java.util.Scanner;

public class HeatWaterEnergy {
    public static void main(String[] args) {
        double waterMass;
        double initTemp;
        double finalTemp;
        double energy;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount of water in kilograms: ");
        waterMass = sc.nextDouble();
        System.out.print("Enter the initial temperature: ");
        initTemp = sc.nextDouble();
        System.out.print("Enter the final temperature: ");
        finalTemp = sc.nextDouble();
        energy = waterMass * (finalTemp - initTemp) * 4184;
        System.out.println("The energy needed is " + energy);
    }
}

package main.Lab2;

import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        double tempC;
        double tempF;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a degree in Celsius: ");
        tempC = sc.nextFloat();
        tempF = (9.0/5.0) * tempC + 32;
        System.out.println(tempC + " Celsius is " + tempF + " Fahrenheit");
    }
}

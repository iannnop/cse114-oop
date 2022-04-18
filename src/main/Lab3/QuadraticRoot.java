package main.Lab3;

import java.util.Scanner;

public class QuadraticRoot {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double discriminant;
        double root1;
        double root2;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of a, b, c separated by spaces:");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        input.close();
        discriminant = Math.pow(b,2) - 4*a*c;

        if (discriminant < 0) {
            System.out.println("The equation has no real roots.");
        }
        else if (discriminant == 0) {
            root1 = -b/(2*a);
            System.out.println("The equation has one root "+root1);
        }
        else {
            root1 = (-b+Math.pow(discriminant, 0.5))/(2*a);
            root2 = (-b-Math.pow(discriminant, 0.5))/(2*a);
            System.out.println("The equation has two roots "+root1+" and "+root2);
        }
    }
}

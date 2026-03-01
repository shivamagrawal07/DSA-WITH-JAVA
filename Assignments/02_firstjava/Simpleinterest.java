// Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.*;

public class Simpleinterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         System.out.print("Enter Principal (P): ");
        double P = sc.nextDouble();

        System.out.print("Enter Time in years (T): ");
        double T = sc.nextDouble();

        System.out.print("Enter Rate of Interest (R): ");
        double R = sc.nextDouble();

        double SI = (P * T * R) / 100;

        System.out.println("Simple Interest = " + SI);


        sc.close();
    }
}


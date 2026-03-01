//  Input currency in rupees and output in USD.

import java.util.Scanner;

public class currencyconverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount in Rupees: ");
        double rupees = sc.nextDouble();

        double exchangeRate = 91.0;
        double usd = rupees / exchangeRate;

        System.out.println("Amount in USD = " + usd);

        sc.close();
    }
}